package sjy.jaengsplay.api.portal.board.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name = "info_board_tb")
public class InfoBoard {
    @ApiModelProperty(value = "정보 게시글 아이디")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String title;
    private String content;
    private String createdUserId;

    // 포스터 이미지

    private String playTitle;
    private String playContent;
    private String playCast;
    private String playRunningTime;
    private String playTerm;

}
