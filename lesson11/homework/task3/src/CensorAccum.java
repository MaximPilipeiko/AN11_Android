public class CensorAccum implements Runnable {
    private final LockSentences badSentences;
    private final String[] sentences;
    private final String[] blackList;

    public CensorAccum(final LockSentences pBadSentences, final String[] pSentences, final String[] pBlackList) {
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
