package in.kanth.DesginPatterns;

public class TestFluentDesign {

	public static void main(String[] args) {

		FluentDesign design = FluentDesign.newBookBuild()
				               .topic("Java")
				                .idno(12344).idno(5678)
				                 .author("Ramakanth").build();
		System.out.println(design.getIdno());

	}

}
