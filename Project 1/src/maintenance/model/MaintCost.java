package maintenance.model;
import java.util.*;

public class MaintCost {
    private int costNumber;
		private float laborCosts;
		private float equipmentCosts;
		private float totalCosts;
		
		public int getCostNumber() {
			return costNumber;
		}
		public void setCostID(int costNumber) {
			this.costNumber = costNumber;
		}
		public float getLaborCost() {
			return laborCosts;
		}
		public void setLaborCost(float laborCosts) {
			this.laborCosts = laborCosts;
		}
		public float getMaterialCost() {
			return equipmentCosts;
		}
		public void setMaterialCost(float equipmentCost) {
			this.equipmentCosts = equipmentCosts;
		}
		public float getTotalCosts() {
			return totalCosts;
		}
		public void setExtra(float totalCosts) {
			this.totalCosts = totalCosts;
		}
	}
