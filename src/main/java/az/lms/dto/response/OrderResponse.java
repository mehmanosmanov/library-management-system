package az.lms.dto.response;

import az.lms.model.OrderType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author Mehman Osmanov on 11.08.23
 * @project LMS
 */
@Data
public class OrderResponse {
   private Long studentId;
   private Long bookId;
   private LocalDateTime orderTime;
   private OrderType orderType;

}