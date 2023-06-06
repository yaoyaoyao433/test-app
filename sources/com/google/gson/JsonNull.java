package com.google.gson;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class JsonNull extends JsonElement {
    public static final JsonNull INSTANCE = new JsonNull();

    @Override // com.google.gson.JsonElement
    public final JsonNull deepCopy() {
        return INSTANCE;
    }

    public final int hashCode() {
        return JsonNull.class.hashCode();
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof JsonNull);
    }
}
