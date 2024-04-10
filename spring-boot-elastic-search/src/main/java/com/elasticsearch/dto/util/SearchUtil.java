//package com.elasticsearch.dto.util;
//
//import org.elasticsearch.action.search.SearchRequest;
//import org.elasticsearch.index.query.*;
//import org.elasticsearch.search.builder.SearchSourceBuilder;
//import org.elasticsearch.search.sort.SortOrder;
//import org.springframework.data.elasticsearch.client.elc.QueryBuilders;
//import org.springframework.util.CollectionUtils;
//
//import com.elasticsearch.dto.SearchRequestDTO;
//
//import java.util.Date;
//import java.util.List;
//
//public final class SearchUtil {
//
//    private SearchUtil() {}
//
//    
//
//    private static QueryBuilders getQueryBuilder(final SearchRequestDTO dto) {
//        if (dto == null) {
//            return null;
//        }
//
//        final List<String> fields = dto.getFields();
//        if (CollectionUtils.isEmpty(fields)) {
//            return null;
//        }
//
//        if (fields.size() > 1) {
//            final var queryBuilder = QueryBuilders.matchAllQuery(dto.getSearchTerm())
//                    .type(MultiMatchQueryBuilder.Type.CROSS_FIELDS)
//                    .operator(Operator.AND);
//
//            fields.forEach(queryBuilder::field);
//
//            return queryBuilder;
//        }
//
//        return fields.stream()
//                .findFirst()
//                .map(field ->
//                        QueryBuilders.matchQuery(field, dto.getSearchTerm())
//                                .operator(Operator.AND))
//                .orElse(null);
//    }
//
//    private static QueryBuilder getQueryBuilder(final String field, final Date date) {
//        return QueryBuilders.rangeQuery(field).gte(date);
//    }
//}
