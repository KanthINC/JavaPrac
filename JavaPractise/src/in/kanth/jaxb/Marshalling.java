package in.kanth.jaxb;

import java.time.LocalDate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshalling {

	public static void main(String[] args) throws JAXBException {

		JAXBContext jaxbcontext = JAXBContext.newInstance(StudentBean.class);

		Marshaller marshallerObj = jaxbcontext.createMarshaller();

		StudentBean bean = new StudentBean("19", "Ramakanth", 922, LocalDate.now());
		marshallerObj.marshal(bean, System.out);

	}

}
