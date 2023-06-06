package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.annotation.Json;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class gi extends gt {
    @Json(name = "styles")
    private List<a> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gi(long j) {
        super(j);
        this.a = new ArrayList();
    }

    public final int a(int i) {
        for (a aVar : this.a) {
            if (aVar.a == i) {
                int i2 = aVar.b + 1;
                aVar.b = i2;
                return i2;
            }
        }
        this.a.add(new a(this.g, i));
        return 1;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static final class a extends gt {
        @Json(name = "id")
        int a;
        @Json(name = "showCount")
        int b;

        private static /* synthetic */ int b(a aVar) {
            int i = aVar.b + 1;
            aVar.b = i;
            return i;
        }

        a(long j, int i) {
            super(j);
            this.a = 0;
            this.b = 0;
            this.a = i;
            this.b = 1;
        }
    }
}
