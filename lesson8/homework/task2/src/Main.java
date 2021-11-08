public class Main {
    private static void verifyLogin(final String login) throws WrongLoginException {
        if (login == null || login.isEmpty()) {
            throw new WrongLoginException("login cannot be empty");
        }
        if (login.length() > 20) {
            throw new WrongLoginException("login is too long");
        }
        for (var symbol : login.toCharArray()) {
            if (symbol >= 'a' && symbol <= 'z') {
                // todo
            }
        }
        if (!login.matches("\\w+")) {
            throw new WrongLoginException("login should contain only latin letters, numbers or underscores");
        }
    }

    private static void verifyPassword(final String password, final String confirmPassword) throws WrongPasswordException {
        if (password == null || password.isEmpty()) {
            throw new WrongPasswordException("password cannot be empty");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("password should be equal to confirmPassword");
        }
        if (!password.matches("\\w+")) {
            throw new WrongPasswordException("password can contains only latin letters, numbers or underscores");
        }
    }

    private static boolean validateCredentials(final String login, final String password, final String confirmPassword) {
        try {
            verifyLogin(login);
            verifyPassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        boolean isCredentialsValid = validateCredentials("john!", "1111", "1111");
        System.out.println("Credentials is valid: " + (isCredentialsValid ? "Yes" : "No"));
    }
}
