package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectionGreetingService implements GreetingService{

  /**
   * @return
   */
  @Override
  public String sayGreeting() {
    return "Heloo World - Property";
  }
}
