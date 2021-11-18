import java.util.List;

public class CensorAccumOptim implements Runnable {
    private final List<String> badSentences;
    private final String[] sentences;
    private final String[] blackList;

    public CensorAccumOptim(final List<String> pBadSentences, final String[] pSentences, final String[] pBlackList) {
        badSentences = pBadSentences;
        sentences = pSentences;
        blackList = pBlackList;
    }

    @Override
    public void run() {
        for (final String sentence : sentences) {
            final String[] words = IOUtils.splitOnWords(sentence);
            if (containsAnyIgnoreCase(words, blackList)) {
                badSentences.add(sentence);
            }
        }
    }

    public boolean containsAnyIgnoreCase(String[] src, String[] checks) {
        for (final String item : src) {
            for (final String check : checks) {
                if (item.equalsIgnoreCase(check)) {
                    return true;
                }
            }
        }

        return false;
    }
}
