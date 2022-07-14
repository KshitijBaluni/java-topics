package designpatterns.creational.builder;

public class CoreJavaBuilder {
  private Director director;

  public Director getDirector() {
    return director;
  }

  public void setDirector(Director director) {
    this.director = director;
  }

  public CoreJavaBuilder(Director director) {
    this.director = director;
  }
}
