package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Engine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int engineId;
	private String type;
	private String model;
	private int engineCc;
	
	public int getEngineId() {
		return engineId;
	}
	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getEngineCc() {
		return engineCc;
	}
	public void setEngineCc(int engineCc) {
		this.engineCc = engineCc;
	}
	
	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", type=" + type + ", model=" + model + ", engineCc=" + engineCc + "]";
	}
	
	
	
}
