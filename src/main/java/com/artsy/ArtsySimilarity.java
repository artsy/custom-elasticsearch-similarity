package com.artsy;

import org.apache.lucene.search.similarities.ClassicSimilarity;

public class ArtsySimilarity extends ClassicSimilarity {
    @Override
    public float queryNorm(float valueForNormalization) {
        return 1.0f;
    }
}
