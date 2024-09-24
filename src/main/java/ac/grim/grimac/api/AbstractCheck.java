package ac.grim.grimac.api;

public interface AbstractCheck {

    String getCheckName();

    String getAlternativeName();

    String getConfigName();

    String getDescription();

    double getViolations();

    double getDecay();

    double getSetbackVL();

    void setEnabled(boolean enabled);

    void reload();

    boolean isExperimental();
}
