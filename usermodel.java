@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private String phone number;
  @Column(nullable = false)
  private String password; // Hashed password
  @Enumerated(EnumType.STRING)
  private UserType userType; // Enum for seller or buyer

  // Getters, setters, and constructors
}

