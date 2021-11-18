public class CensorMarker implements Runnable {
    private final Marker hasBadWord;
    private final String[] sentences;
    private final String[] blackList;

    public CensorMarker(final Marker pHasBadWord, final String[] pSentences, final String[] pBlackList) {
        hasBadWord = pHasBadWord;
        sentences = pSentences;
        blackList = pBlackList;
    }

    @Override
    public void run() {
        for (final String sentence : sentences) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException pE) {
                pE.printStackTrace();
            }
            final String[] words = IOUtils.splitOnWords(sentence);
            if (containsAnyIgnoreCase(words, blackList)) {
                hasBadWord.mark();
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
