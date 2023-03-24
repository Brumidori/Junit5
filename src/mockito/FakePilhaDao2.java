package mockito;

public class FakePilhaDao2 implements IPilhaDao {

	@Override
	public void save() {
		System.out.println("Fake PilhaDao");
	}

}
