package springboot.api.oserious.topic;

public class TopicObject {

	private String id;
	private String description;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TopicObject(String id, String description, String name) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
	}

	public TopicObject() {
	}

}
