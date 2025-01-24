package com.devsuperior.dslist.projections;

public interface GameMinProjection {
    Long getId();
    String getTitle();
    Integer getGameeYear();
    String getImgUrl();
    String getShortDescription();
    Integer position();
}
