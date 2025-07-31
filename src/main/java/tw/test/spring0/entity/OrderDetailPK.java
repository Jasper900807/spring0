package tw.test.spring0.entity;

import java.io.Serializable;
import java.util.Objects;

public class OrderDetailPK implements Serializable {
	private Long orderId;
	private Long productId;
	
	@Override
	public int hashCode() {
		return Objects.hash(orderId, productId);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof OrderDetailPK)) return false;
		OrderDetailPK other = (OrderDetailPK)obj;
		return Objects.equals(orderId, other.orderId) && Objects.equals(productId, other.productId);
	}
}
