package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.annotation.Json;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class gn extends gt {
    @Json(name = "ubs")
    public a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gn(long j) {
        super(j);
        this.a = new a(j);
    }

    private a a() {
        return this.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a extends gt {
        @Json(name = "showCount")
        private int a;

        a(long j) {
            super(j);
            this.a = 0;
        }

        public final int a() {
            int i = this.a + 1;
            this.a = i;
            return i;
        }
    }
}
