package guru.springframework.sfgdi.services;

public class GreetingServiceImpl implements
    GreetingService {

  /**
   * @return
   */
  @Override
  public String sayGreeting() {
    return "Hello World!!!";
  }
}
