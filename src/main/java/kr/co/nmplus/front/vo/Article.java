package kr.co.nmplus.front.vo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Article {
    private String title;
    private String bodyData;
    private String createData;
    private String createUserId;
    private int number;

}
