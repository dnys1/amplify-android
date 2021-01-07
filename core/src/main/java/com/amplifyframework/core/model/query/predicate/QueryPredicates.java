/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amplifyframework.core.model.query.predicate;

/**
 * A factory class for building {@link QueryPredicate}s.
 */
public final class QueryPredicates {
    private QueryPredicates() {}

    /**
     * Creates a {@link QueryPredicate} which matches any object it is asked to evaluate.
     * @return A query predicate that matches everything.
     */
    public static MatchAllQueryPredicate all() {
        return MatchAllQueryPredicate.instance();
    }

    /**
     * Creates a {@link QueryPredicate} which matches nothing.
     * @return A query predicate that matches nothing.
     */
    public static MatchNoneQueryPredicate none() {
        return MatchNoneQueryPredicate.instance();
    }
}