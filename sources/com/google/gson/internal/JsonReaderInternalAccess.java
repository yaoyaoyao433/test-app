package com.google.gson.internal;

import com.google.gson.stream.JsonReader;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class JsonReaderInternalAccess {
    public static JsonReaderInternalAccess INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader) throws IOException;
}
