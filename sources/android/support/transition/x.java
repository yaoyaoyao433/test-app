package android.support.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class x {
    public View b;
    public final Map<String, Object> a = new HashMap();
    final ArrayList<Transition> c = new ArrayList<>();

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            return this.b == xVar.b && this.a.equals(xVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        for (String str2 : this.a.keySet()) {
            str = str + "    " + str2 + ": " + this.a.get(str2) + "\n";
        }
        return str;
    }
}
