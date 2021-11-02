package day1;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Singer {	// vo, dto 객체들은 bean 으로 관리하지 않습니다. -> Model 객체
	private int idx;
	private String singer;
	private List<String> albums;
}
