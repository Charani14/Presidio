@Entity
public class Property {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String location;
  private int area;
  private int bedrooms;
  private int bathrooms;
  private String amenities; // Comma-separated list or other approach
  @ManyToOne
  private User seller; // Foreign key referencing User

  // Getters, setters, and constructors
}