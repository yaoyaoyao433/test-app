package com.facebook.react.devsupport;

import android.support.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.io.File;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    private static final Pattern a = Pattern.compile("^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$");
    private static final Pattern b = Pattern.compile("\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$");

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements com.facebook.react.devsupport.interfaces.c {
        private final String a;
        private final String b;
        private final int c;
        private final int d;
        private final String e;
        private final boolean f;

        private a(String str, String str2, int i, int i2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = i2;
            this.e = str != null ? new File(str).getName() : "";
            this.f = z;
        }

        private a(String str, String str2, int i, int i2) {
            this(str, str2, i, i2, false);
        }

        @Override // com.facebook.react.devsupport.interfaces.c
        public final String a() {
            return this.a;
        }

        @Override // com.facebook.react.devsupport.interfaces.c
        public final String b() {
            return this.b;
        }

        @Override // com.facebook.react.devsupport.interfaces.c
        public final int c() {
            return this.c;
        }

        @Override // com.facebook.react.devsupport.interfaces.c
        public final int d() {
            return this.d;
        }
    }

    public static com.facebook.react.devsupport.interfaces.c[] a(@Nullable ReadableArray readableArray) {
        int size = readableArray != null ? readableArray.size() : 0;
        com.facebook.react.devsupport.interfaces.c[] cVarArr = new com.facebook.react.devsupport.interfaces.c[size];
        for (int i = 0; i < size; i++) {
            ReadableType type = readableArray.getType(i);
            if (type == ReadableType.Map) {
                ReadableMap map = readableArray.getMap(i);
                String string = map.getString("methodName");
                cVarArr[i] = new a(map.getString("file"), string, (!map.hasKey("lineNumber") || map.isNull("lineNumber")) ? -1 : map.getInt("lineNumber"), (!map.hasKey("column") || map.isNull("column")) ? -1 : map.getInt("column"), map.hasKey("collapse") && !map.isNull("collapse") && map.getBoolean("collapse"));
            } else if (type == ReadableType.String) {
                cVarArr[i] = new a(readableArray.getString(i));
            }
        }
        return cVarArr;
    }
}
