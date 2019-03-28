package in.kanth.jaxb;

import java.time.LocalDate;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StudentBean {

	@XmlAttribute
	private String id;

	@XmlElement
	private String name;

	@XmlElement
	private double marks;

	@XmlElement
	private LocalDate dateofjoin;

	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + ", marks=" + marks + ", dateofjoin=" + dateofjoin + "]";
	}

	public StudentBean(String id, String name, double marks, LocalDate dateofjoin) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.dateofjoin = dateofjoin;
	}

	public StudentBean() {

	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getMarks() {
		return marks;
	}

	public LocalDate getDateofjoin() {
		return dateofjoin;
	}

}
