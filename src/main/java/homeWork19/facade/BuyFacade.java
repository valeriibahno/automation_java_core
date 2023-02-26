package homeWork19.facade;

public class BuyFacade {

    User user = new User();
    Course course = new Course();

    public void buyCourse(String name, String nameCourse) {
        user.registration(name);
        course.selectCourse(nameCourse);
        user.buyCourse(name);
    }
}
