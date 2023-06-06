package com.google.gson;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public final JsonElement serialize(Long l) {
            return new JsonPrimitive((Number) l);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public final JsonElement serialize(Long l) {
            return new JsonPrimitive(String.valueOf(l));
        }
    };

    public abstract JsonElement serialize(Long l);
}
