package com.artsy;

import org.elasticsearch.plugins.Plugin;
import org.elasticsearch.index.IndexModule;
import org.elasticsearch.index.similarity.SimilarityProvider;

import org.apache.lucene.search.similarities.Similarity;

public class ArtsySimilarityPlugin extends Plugin
{

    @Override
    public void onIndexModule(IndexModule indexModule) {
      indexModule.addSimilarity("artsy_similarity", (name, indexSettings) ->
        new SimilarityProvider() {
           @Override
           public String name() {
               return name;
           }

           @Override
           public Similarity get() {
               return new ArtsySimilarity();
           }  
        });
    }
}
