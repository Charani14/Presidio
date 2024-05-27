@Service
public class PropertyService {

  @Autowired
  private PropertyRepository propertyRepository;

  public Property saveProperty(Property property, User seller) {
    property.setSeller(seller);
    return propertyRepository.save(property);
  }

  public List<Property> getAllProperties() {
    return propertyRepository.findAll();
  }

  // Additional methods for finding by seller, filtering, etc.
}