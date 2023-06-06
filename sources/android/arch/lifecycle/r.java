package android.arch.lifecycle;

import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class r {
    final HashMap<String, o> a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, o oVar) {
        o put = this.a.put(str, oVar);
        if (put != null) {
            put.a();
        }
    }

    public final void a() {
        for (o oVar : this.a.values()) {
            oVar.a();
        }
        this.a.clear();
    }
}
