package com.aclusive.recommenderengineservice.service;

import com.aclusive.recommenderengineservice.model.Recommendation;
import java.util.List;

public interface RecommendationEngineService {
	Recommendation getRecommendationById(Long recommendationId);
    Recommendation saveRecommendation(Recommendation recommendation);
    List<Recommendation> getAllRecommendationByProductName(String productName);
    void deleteRecommendation(Long id);
}
