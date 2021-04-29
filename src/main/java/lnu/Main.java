package lnu;

import lnu.pitest.OptionsParser;
import lnu.pitest.ParseResult;
import lnu.pitest.PluginFilter;
import org.pitest.mutationtest.config.PluginServices;
import org.pitest.mutationtest.config.ReportOptions;
import org.pitest.mutationtest.tooling.AnalysisResult;
import org.pitest.mutationtest.tooling.CombinedStatistics;
import org.pitest.mutationtest.tooling.EntryPoint;
import org.pitest.util.Unchecked;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final PluginServices plugins = PluginServices.makeForContextLoader();
        final OptionsParser parser = new OptionsParser(new PluginFilter(plugins));

        List<String> newArgs = new ArrayList<>();
        newArgs.add("--sourceDirs");
        newArgs.add("C:/Users/rashi/Desktop/2dv20e/demo/models/src");
        newArgs.add("--targetClasses");
        newArgs.add("com.app.*");
        newArgs.add("--reportDir");
        newArgs.add("C:/Users/rashi/Desktop/2dv20e/demo");
        newArgs.add("--verbose");
        //newArgs.add("--targetTests");
        //newArgs.add("C:/Users/rashi/Desktop/2dv20e/demo/com.app*");
        String[] arr = new String[newArgs.size()];
        newArgs.toArray(arr);

        final ParseResult pr = parser.parse(arr);

        if (!pr.isOk()) {
            parser.printHelp();
            System.out.println(">>>> " + pr.getErrorMessage().get());
        } else {
            final ReportOptions data = pr.getOptions();

            final CombinedStatistics stats = runReport(data, plugins);

        }
    }

    private static CombinedStatistics runReport(ReportOptions data,
                                                PluginServices plugins) {

        final EntryPoint e = new EntryPoint();
        final AnalysisResult result = e.execute(null, data, plugins,
                new HashMap<>());
        if (result.getError().isPresent()) {
            throw Unchecked.translateCheckedException(result.getError().get());
        }
        return result.getStatistics().get();

    }

}
