package homeWork19.factory;

public class FactoryCourses {

    public Courses getTypePage(String programLanguage) {
        if (programLanguage == null) {
            return null;
        }
        if (programLanguage.equalsIgnoreCase("Java")) {
            return new JavaCourse();
        }
        if (programLanguage.equalsIgnoreCase("TypeScript")) {
            return new TypeScriptCourse();
        }
        if (programLanguage.equalsIgnoreCase("Python")) {
            return new PythonCourse();
        }
        return null;
    }

}
