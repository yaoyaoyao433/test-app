package com.meituan.android.common.locate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class GearsLocationState {
    private static State a = State.GERARS_START;
    private static boolean b = true;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* loaded from: classes2.dex */
    public enum State {
        GERARS_START(1),
        FINGERPRINT(2),
        NETWORK_POST(3),
        DELIVER(4),
        INTERFACE_DELIVER(5);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private final int weight;

        State(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88be6e88fd458d1cef95d3965ebf030b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88be6e88fd458d1cef95d3965ebf030b");
            } else {
                this.weight = i;
            }
        }

        public static State valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (State) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b3aefd78c281c7dbeda99a531caddd03", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b3aefd78c281c7dbeda99a531caddd03") : Enum.valueOf(State.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static State[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (State[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "51dcfec513a31af4f1f06cbc78e5f268", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "51dcfec513a31af4f1f06cbc78e5f268") : values().clone());
        }

        public final int value() {
            return this.weight;
        }
    }

    public static synchronized void a(State state) {
        synchronized (GearsLocationState.class) {
            a = state;
        }
    }

    public static synchronized void a(boolean z) {
        synchronized (GearsLocationState.class) {
            b = z;
        }
    }

    public static synchronized boolean a() {
        boolean z;
        synchronized (GearsLocationState.class) {
            z = b;
        }
        return z;
    }

    public static int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "316ab3a713517cf33a99c65b32a3d6d1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "316ab3a713517cf33a99c65b32a3d6d1")).intValue() : a.weight;
    }
}
