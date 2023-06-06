package com.meituan.msc.uimanager;

import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.view.View;
import com.meituan.msc.devsupport.perf.RenderPerf;
import com.meituan.msc.jse.bridge.Callback;
import com.meituan.msc.jse.bridge.GuardedRunnable;
import com.meituan.msc.jse.bridge.IRuntimeDelegate;
import com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.ReactSoftException;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.RetryableMountingLayerException;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.modules.core.c;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UIViewOperationQueue {
    public static ChangeQuickRedirect a = null;
    private static final String h = "UIViewOperationQueue";
    private long A;
    private long B;
    private long C;
    final h b;
    final boolean c;
    ArrayList<f> d;
    ArrayList<u> e;
    boolean f;
    long g;
    private final int[] i;
    private final NativeViewHierarchyManager j;
    private final Object k;
    private final Object l;
    private final ReactApplicationContext m;
    @GuardedBy("mDispatchRunnablesLock")
    private ArrayList<Runnable> n;
    @GuardedBy("mNonBatchedOperationsLock")
    private ArrayDeque<u> o;
    @Nullable
    private com.meituan.msc.uimanager.debug.a p;
    private boolean q;
    private boolean r;
    private long s;
    private long t;
    private long u;
    private long v;
    private long w;
    private long x;
    private long y;
    private long z;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    interface f {
        void b();

        void c();

        int d();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface u {
        void a();
    }

    public static /* synthetic */ boolean a(UIViewOperationQueue uIViewOperationQueue, boolean z) {
        uIViewOperationQueue.q = true;
        return true;
    }

    public static /* synthetic */ RenderPerf d(UIViewOperationQueue uIViewOperationQueue) {
        IRuntimeDelegate runtimeDelegate;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, uIViewOperationQueue, changeQuickRedirect, false, "8e83d6677b46636beab89805f5e53880", RobustBitConfig.DEFAULT_VALUE)) {
            return (RenderPerf) PatchProxy.accessDispatch(objArr, uIViewOperationQueue, changeQuickRedirect, false, "8e83d6677b46636beab89805f5e53880");
        }
        if (uIViewOperationQueue.m == null || (runtimeDelegate = uIViewOperationQueue.m.getRuntimeDelegate()) == null) {
            return null;
        }
        return runtimeDelegate.getRenderPerf();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public abstract class y implements u {
        public int i;

        public y(int i) {
            this.i = i;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    final class p extends y {
        public static ChangeQuickRedirect a;

        public p(int i) {
            super(i);
            Object[] objArr = {UIViewOperationQueue.this, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "768930e3e5470db4e8a6082d6b66a5fe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "768930e3e5470db4e8a6082d6b66a5fe");
            }
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb9f4dc91d16a5bb49bd4b4ace44e1e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb9f4dc91d16a5bb49bd4b4ace44e1e4");
            } else {
                UIViewOperationQueue.this.a().d(this.i);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public final class w extends y {
        public static ChangeQuickRedirect a;
        public final ab b;
        private String d;

        private w(int i, String str, ab abVar) {
            super(i);
            Object[] objArr = {UIViewOperationQueue.this, Integer.valueOf(i), str, abVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e923171b385f5e655d3c97a0acffea3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e923171b385f5e655d3c97a0acffea3");
                return;
            }
            this.b = abVar;
            this.d = str;
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d877beee06c2825b639dd5fdd67938db", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d877beee06c2825b639dd5fdd67938db");
            } else {
                UIViewOperationQueue.this.a().a(this.i, this.d, this.b);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public final class v extends y {
        public static ChangeQuickRedirect a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        private final String k;

        public v(int i, int i2, int i3, int i4, int i5, int i6, int i7, String str) {
            super(i3);
            Object[] objArr = {UIViewOperationQueue.this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31101e8d791ed0ba7765f477766a1d3b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31101e8d791ed0ba7765f477766a1d3b");
                return;
            }
            this.g = i;
            this.b = i2;
            this.c = i4;
            this.d = i5;
            this.e = i6;
            this.f = i7;
            this.k = str;
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae5de1a7eeea4a0f2e4ab0d1536be6fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae5de1a7eeea4a0f2e4ab0d1536be6fc");
                return;
            }
            PerfTrace.begin("UI-UpdateLayoutOperation").a("tag", Integer.valueOf(this.i)).a("name", this.k);
            UIViewOperationQueue.this.a().a(this.b, this.i, this.c, this.d, this.e, this.f, this.k);
            PerfTrace.end("UI-UpdateLayoutOperation").a("tag", Integer.valueOf(this.i)).a("name", this.k);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public final class c extends y {
        public static ChangeQuickRedirect a;
        public final ThemedReactContext b;
        public final String c;
        @Nullable
        public final ab d;

        public c(ThemedReactContext themedReactContext, int i, String str, @Nullable ab abVar) {
            super(i);
            Object[] objArr = {UIViewOperationQueue.this, themedReactContext, Integer.valueOf(i), str, abVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56391179032cc1ce14f37927807c013e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56391179032cc1ce14f37927807c013e");
                return;
            }
            this.b = themedReactContext;
            this.c = str;
            this.d = abVar;
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee5a032dceeabc6cb52a5431a37553e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee5a032dceeabc6cb52a5431a37553e7");
            } else {
                UIViewOperationQueue.this.a().a(this.b, this.i, this.c, this.d);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public final class k extends y {
        public static ChangeQuickRedirect a;
        @Nullable
        public final int[] b;
        @Nullable
        public final aq[] c;
        @Nullable
        public final int[] d;

        public k(int i, @Nullable int[] iArr, @Nullable aq[] aqVarArr, @Nullable int[] iArr2) {
            super(i);
            Object[] objArr = {UIViewOperationQueue.this, Integer.valueOf(i), iArr, aqVarArr, iArr2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "410d12d81953106ca29cad5590f3f710", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "410d12d81953106ca29cad5590f3f710");
                return;
            }
            this.b = iArr;
            this.c = aqVarArr;
            this.d = iArr2;
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acb12f5a32ca206f424e5d690a3fd4a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acb12f5a32ca206f424e5d690a3fd4a7");
                return;
            }
            PerfTrace.begin("UI-ManageChildrenOperation").a("tag", Integer.valueOf(this.i));
            UIViewOperationQueue.this.a().a(this.i, this.b, this.c, this.d);
            PerfTrace.end("UI-ManageChildrenOperation").a("tag", Integer.valueOf(this.i));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public final class x extends y {
        public static ChangeQuickRedirect a;
        public final Object b;

        public x(int i, Object obj) {
            super(i);
            Object[] objArr = {UIViewOperationQueue.this, Integer.valueOf(i), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4527a42fb9bfebfbcea385ac90a83ef5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4527a42fb9bfebfbcea385ac90a83ef5");
            } else {
                this.b = obj;
            }
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f49c07f81f025b2a9ee6deac6e4aeac2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f49c07f81f025b2a9ee6deac6e4aeac2");
            } else {
                UIViewOperationQueue.this.a().a(this.i, this.b);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    final class a extends y {
        public static ChangeQuickRedirect a;
        private final int c;
        private final boolean d;
        private final boolean e;

        public a(int i, int i2, boolean z, boolean z2) {
            super(i);
            Object[] objArr = {UIViewOperationQueue.this, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e27804ac543c8fa391a27dae1a8856f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e27804ac543c8fa391a27dae1a8856f");
                return;
            }
            this.c = i2;
            this.e = z;
            this.d = z2;
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42479b56a7006b7bc2427f41ec7162ed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42479b56a7006b7bc2427f41ec7162ed");
            } else if (!this.e) {
                UIViewOperationQueue.this.a().a(this.i, this.c, this.d);
            } else {
                UIViewOperationQueue.this.a().b();
            }
        }
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes3.dex */
    final class e extends y implements f {
        public static ChangeQuickRedirect a;
        private final int c;
        @Nullable
        private final ReadableArray d;
        private int e;

        public e(int i, int i2, @Nullable ReadableArray readableArray) {
            super(i);
            Object[] objArr = {UIViewOperationQueue.this, Integer.valueOf(i), Integer.valueOf(i2), readableArray};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a103497d91a4c866dce5589d8e89a87d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a103497d91a4c866dce5589d8e89a87d");
                return;
            }
            this.e = 0;
            this.c = i2;
            this.d = readableArray;
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae3b790ee92ad522b5422942268d013a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae3b790ee92ad522b5422942268d013a");
                return;
            }
            try {
                UIViewOperationQueue.this.a().a(this.i, this.c, this.d);
            } catch (Throwable th) {
                ReactSoftException.logSoftException(UIViewOperationQueue.h, new RuntimeException("Error dispatching View Command", th));
            }
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.f
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6db95e39f767784097a45d54f4fc98f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6db95e39f767784097a45d54f4fc98f");
            } else {
                UIViewOperationQueue.this.a().a(this.i, this.c, this.d);
            }
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.f
        @UiThread
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea575cc51d2f2ef10c9ef9d0e6b33fc6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea575cc51d2f2ef10c9ef9d0e6b33fc6");
            } else {
                this.e++;
            }
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.f
        @UiThread
        public final int d() {
            return this.e;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    final class g extends y implements f {
        public static ChangeQuickRedirect a;
        private final String c;
        @Nullable
        private final ReadableArray d;
        private int e;

        public g(int i, String str, @Nullable ReadableArray readableArray) {
            super(i);
            Object[] objArr = {UIViewOperationQueue.this, Integer.valueOf(i), str, readableArray};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bd1c908de027a7d4bb41088eeb11cdf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bd1c908de027a7d4bb41088eeb11cdf");
                return;
            }
            this.e = 0;
            this.c = str;
            this.d = readableArray;
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5dcb5c6154b7e536751161f913d5f57", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5dcb5c6154b7e536751161f913d5f57");
                return;
            }
            try {
                UIViewOperationQueue.this.a().a(this.i, this.c, this.d);
            } catch (Throwable th) {
                ReactSoftException.logSoftException(UIViewOperationQueue.h, new RuntimeException("Error dispatching View Command", th));
            }
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.f
        @UiThread
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30c7b5ad19c641e5cf9f49004f10b046", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30c7b5ad19c641e5cf9f49004f10b046");
            } else {
                UIViewOperationQueue.this.a().a(this.i, this.c, this.d);
            }
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.f
        @UiThread
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbec35403dcf40d9a5a5291996684ad7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbec35403dcf40d9a5a5291996684ad7");
            } else {
                this.e++;
            }
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.f
        public final int d() {
            return this.e;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    final class s extends y {
        public static ChangeQuickRedirect a;
        private final ReadableArray c;
        private final Callback d;
        private final Callback e;

        public s(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
            super(i);
            Object[] objArr = {UIViewOperationQueue.this, Integer.valueOf(i), readableArray, callback, callback2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c75e1641a38c881593e3bbbb4f1d8b1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c75e1641a38c881593e3bbbb4f1d8b1");
                return;
            }
            this.c = readableArray;
            this.d = callback;
            this.e = callback2;
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3141bb2a7cb1193c8d81fea895d57196", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3141bb2a7cb1193c8d81fea895d57196");
            } else {
                UIViewOperationQueue.this.a().a(this.i, this.c, this.e, this.d);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    final class d implements u {
        public static ChangeQuickRedirect a;

        private d() {
            Object[] objArr = {UIViewOperationQueue.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b84cd86d86b42efc1846275db8656017", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b84cd86d86b42efc1846275db8656017");
            }
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70052465f455c35eeac989a4046d63d5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70052465f455c35eeac989a4046d63d5");
                return;
            }
            NativeViewHierarchyManager a2 = UIViewOperationQueue.this.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = NativeViewHierarchyManager.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "b320175eca495e72b4805d46c6a40d80", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "b320175eca495e72b4805d46c6a40d80");
            } else if (a2.e != null) {
                a2.e.dismiss();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class r implements u {
        public static ChangeQuickRedirect a;
        private final boolean c;

        private r(boolean z) {
            Object[] objArr = {UIViewOperationQueue.this, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c28517b38f181c9cf707b477ebdfb9b2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c28517b38f181c9cf707b477ebdfb9b2");
            } else {
                this.c = z;
            }
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be46e257f9fcff116741299a541c5dc7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be46e257f9fcff116741299a541c5dc7");
                return;
            }
            UIViewOperationQueue.this.a().d = this.c;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class b implements u {
        public static ChangeQuickRedirect a;
        private final ReadableMap c;
        private final Callback d;

        private b(ReadableMap readableMap, Callback callback) {
            Object[] objArr = {UIViewOperationQueue.this, readableMap, callback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6b9e90b8cf788ad64a06d85ecaa46bc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6b9e90b8cf788ad64a06d85ecaa46bc");
                return;
            }
            this.c = readableMap;
            this.d = callback;
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad600984427337e9e8d8a39d579fbafd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad600984427337e9e8d8a39d579fbafd");
                return;
            }
            NativeViewHierarchyManager a2 = UIViewOperationQueue.this.a();
            ReadableMap readableMap = this.c;
            final Callback callback = this.d;
            Object[] objArr2 = {readableMap, callback};
            ChangeQuickRedirect changeQuickRedirect2 = NativeViewHierarchyManager.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "227e9f5ede1378538212523026a58bbc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "227e9f5ede1378538212523026a58bbc");
                return;
            }
            final com.meituan.msc.uimanager.layoutanimation.e eVar = a2.c;
            Object[] objArr3 = {readableMap, callback};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.uimanager.layoutanimation.e.a;
            if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "ad0703664e2f69a238f97b23c499bfc5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "ad0703664e2f69a238f97b23c499bfc5");
            } else if (readableMap == null) {
                eVar.a();
            } else {
                eVar.f = false;
                int i = readableMap.hasKey("duration") ? readableMap.getInt("duration") : 0;
                if (readableMap.hasKey(com.meituan.msc.uimanager.layoutanimation.g.a(com.meituan.msc.uimanager.layoutanimation.g.CREATE))) {
                    eVar.b.a(readableMap.getMap(com.meituan.msc.uimanager.layoutanimation.g.a(com.meituan.msc.uimanager.layoutanimation.g.CREATE)), i);
                    eVar.f = true;
                }
                if (readableMap.hasKey(com.meituan.msc.uimanager.layoutanimation.g.a(com.meituan.msc.uimanager.layoutanimation.g.UPDATE))) {
                    eVar.c.a(readableMap.getMap(com.meituan.msc.uimanager.layoutanimation.g.a(com.meituan.msc.uimanager.layoutanimation.g.UPDATE)), i);
                    eVar.f = true;
                }
                if (readableMap.hasKey(com.meituan.msc.uimanager.layoutanimation.g.a(com.meituan.msc.uimanager.layoutanimation.g.DELETE))) {
                    eVar.d.a(readableMap.getMap(com.meituan.msc.uimanager.layoutanimation.g.a(com.meituan.msc.uimanager.layoutanimation.g.DELETE)), i);
                    eVar.f = true;
                }
                if (!eVar.f || callback == null) {
                    return;
                }
                eVar.h = new Runnable() { // from class: com.meituan.msc.uimanager.layoutanimation.e.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2d993a00f32f65fda4de50293ad458d6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2d993a00f32f65fda4de50293ad458d6");
                        } else {
                            callback.invoke(Boolean.TRUE);
                        }
                    }
                };
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public final class m implements u {
        public static ChangeQuickRedirect a;
        private final int c;
        private final Callback d;

        private m(int i, Callback callback) {
            Object[] objArr = {UIViewOperationQueue.this, Integer.valueOf(i), callback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26b69c1c9860161713e977104a1c36c0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26b69c1c9860161713e977104a1c36c0");
                return;
            }
            this.c = i;
            this.d = callback;
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1b065ed9e3ca7a9ed01b4901e3ef041", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1b065ed9e3ca7a9ed01b4901e3ef041");
                return;
            }
            try {
                UIViewOperationQueue.this.a().a(this.c, UIViewOperationQueue.this.i);
                float c = com.meituan.msc.uimanager.s.c(UIViewOperationQueue.this.i[0]);
                float c2 = com.meituan.msc.uimanager.s.c(UIViewOperationQueue.this.i[1]);
                this.d.invoke(0, 0, Float.valueOf(com.meituan.msc.uimanager.s.c(UIViewOperationQueue.this.i[2])), Float.valueOf(com.meituan.msc.uimanager.s.c(UIViewOperationQueue.this.i[3])), Float.valueOf(c), Float.valueOf(c2));
            } catch (com.meituan.msc.uimanager.o unused) {
                this.d.invoke(new Object[0]);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    final class l implements u {
        public static ChangeQuickRedirect a;
        private final int c;
        private final Callback d;

        private l(int i, Callback callback) {
            Object[] objArr = {UIViewOperationQueue.this, Integer.valueOf(i), callback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "703f6485fdc6f4f45d37686ca36a70f1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "703f6485fdc6f4f45d37686ca36a70f1");
                return;
            }
            this.c = i;
            this.d = callback;
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f0a267c5989fe8eaffcfd91a73f41c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f0a267c5989fe8eaffcfd91a73f41c6");
                return;
            }
            try {
                UIViewOperationQueue.this.a().b(this.c, UIViewOperationQueue.this.i);
                this.d.invoke(Float.valueOf(com.meituan.msc.uimanager.s.c(UIViewOperationQueue.this.i[0])), Float.valueOf(com.meituan.msc.uimanager.s.c(UIViewOperationQueue.this.i[1])), Float.valueOf(com.meituan.msc.uimanager.s.c(UIViewOperationQueue.this.i[2])), Float.valueOf(com.meituan.msc.uimanager.s.c(UIViewOperationQueue.this.i[3])));
            } catch (com.meituan.msc.uimanager.o unused) {
                this.d.invoke(new Object[0]);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    final class i implements u {
        public static ChangeQuickRedirect a;
        private final int c;
        private final float d;
        private final float e;
        private final Callback f;

        private i(int i, float f, float f2, Callback callback) {
            Object[] objArr = {UIViewOperationQueue.this, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), callback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02985833fffdb81b70b645cb92b7b2ee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02985833fffdb81b70b645cb92b7b2ee");
                return;
            }
            this.c = i;
            this.d = f;
            this.e = f2;
            this.f = callback;
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "627eb3bf88f6709a696cfe3df00081a4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "627eb3bf88f6709a696cfe3df00081a4");
                return;
            }
            try {
                UIViewOperationQueue.this.a().a(this.c, UIViewOperationQueue.this.i);
                float f = UIViewOperationQueue.this.i[0];
                float f2 = UIViewOperationQueue.this.i[1];
                int a2 = UIViewOperationQueue.this.a().a(this.c, this.d, this.e);
                try {
                    UIViewOperationQueue.this.a().a(a2, UIViewOperationQueue.this.i);
                    this.f.invoke(Integer.valueOf(a2), Float.valueOf(com.meituan.msc.uimanager.s.c(UIViewOperationQueue.this.i[0] - f)), Float.valueOf(com.meituan.msc.uimanager.s.c(UIViewOperationQueue.this.i[1] - f2)), Float.valueOf(com.meituan.msc.uimanager.s.c(UIViewOperationQueue.this.i[2])), Float.valueOf(com.meituan.msc.uimanager.s.c(UIViewOperationQueue.this.i[3])));
                } catch (com.meituan.msc.uimanager.g unused) {
                    this.f.invoke(new Object[0]);
                }
            } catch (com.meituan.msc.uimanager.g unused2) {
                this.f.invoke(new Object[0]);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    final class j implements u {
        public static ChangeQuickRedirect a;
        private final aa c;
        private final com.meituan.msc.uimanager.i d;

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f4cf4c9f4034c554b577bc5feb3b30f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f4cf4c9f4034c554b577bc5feb3b30f");
            }
        }

        private j(aa aaVar, com.meituan.msc.uimanager.i iVar) {
            Object[] objArr = {UIViewOperationQueue.this, aaVar, iVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02b2a0bdea462c65d46360f5ae555302", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02b2a0bdea462c65d46360f5ae555302");
                return;
            }
            this.c = aaVar;
            this.d = iVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class t implements u {
        public static ChangeQuickRedirect a;
        private final am c;

        public t(am amVar) {
            Object[] objArr = {UIViewOperationQueue.this, amVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff45373a29d83fba219c205e5f2f8a89", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff45373a29d83fba219c205e5f2f8a89");
            } else {
                this.c = amVar;
            }
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d6addd297b2883538e749bbbdbd6b0a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d6addd297b2883538e749bbbdbd6b0a");
            } else {
                this.c.a(UIViewOperationQueue.this.a());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    final class q extends y {
        public static ChangeQuickRedirect a;
        private final int c;

        private q(int i, int i2) {
            super(i);
            Object[] objArr = {UIViewOperationQueue.this, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbb6fcbab135fa30f0423efd2e82a0e5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbb6fcbab135fa30f0423efd2e82a0e5");
            } else {
                this.c = i2;
            }
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5950ccb464d8fe0d882f20f593b190f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5950ccb464d8fe0d882f20f593b190f4");
                return;
            }
            NativeViewHierarchyManager a2 = UIViewOperationQueue.this.a();
            int i = this.i;
            int i2 = this.c;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = NativeViewHierarchyManager.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "e4157303037f35e76800f8b27409c874", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "e4157303037f35e76800f8b27409c874");
                return;
            }
            View view = a2.b.get(i);
            if (view == null) {
                throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
            }
            view.sendAccessibilityEvent(i2);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    final class n implements u {
        public static ChangeQuickRedirect a;
        private final ReadableArray c;
        private final ReadableMap d;
        private final Callback e;

        private n(ReadableArray readableArray, ReadableMap readableMap, Callback callback) {
            Object[] objArr = {UIViewOperationQueue.this, readableArray, readableMap, callback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfdf22970acc9f0842e124a4c8a82f23", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfdf22970acc9f0842e124a4c8a82f23");
                return;
            }
            this.c = readableArray;
            this.d = readableMap;
            this.e = callback;
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d40cce8252749f63623cda656dc69135", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d40cce8252749f63623cda656dc69135");
                return;
            }
            try {
                this.e.invoke(UIViewOperationQueue.this.a().a(this.c, this.d));
            } catch (com.meituan.msc.uimanager.o e) {
                e.printStackTrace();
                this.e.invoke(new Object[0]);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public final class o implements u {
        public static ChangeQuickRedirect a;
        private final ReadableMap c;
        private final Callback d;

        private o(ReadableMap readableMap, Callback callback) {
            Object[] objArr = {UIViewOperationQueue.this, readableMap, callback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27d5eba56c5eaf8215f58246747991c9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27d5eba56c5eaf8215f58246747991c9");
                return;
            }
            this.c = readableMap;
            this.d = callback;
        }

        @Override // com.meituan.msc.uimanager.UIViewOperationQueue.u
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05e560f7b145d6d335249b4e2e0a05ec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05e560f7b145d6d335249b4e2e0a05ec");
                return;
            }
            try {
                this.d.invoke(UIViewOperationQueue.this.a().a(this.c));
            } catch (com.meituan.msc.uimanager.o unused) {
                this.d.invoke(new Object[0]);
            }
        }
    }

    public UIViewOperationQueue(ReactApplicationContext reactApplicationContext, NativeViewHierarchyManager nativeViewHierarchyManager, int i2) {
        Object[] objArr = {reactApplicationContext, nativeViewHierarchyManager, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "492050d0c66ace4c1941e2fd3586c1a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "492050d0c66ace4c1941e2fd3586c1a9");
            return;
        }
        this.i = new int[4];
        this.k = new Object();
        this.l = new Object();
        this.d = new ArrayList<>();
        this.e = new ArrayList<>();
        this.n = new ArrayList<>();
        this.o = new ArrayDeque<>();
        this.f = false;
        this.q = false;
        this.r = false;
        this.j = nativeViewHierarchyManager;
        this.b = new h(reactApplicationContext, i2 == -1 ? 8 : i2);
        this.m = reactApplicationContext;
        this.c = com.meituan.msc.jse.config.a.f;
    }

    public void a(u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5b728e3543b4adac25f0624dfca6633", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5b728e3543b4adac25f0624dfca6633");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            uVar.a();
        } else {
            synchronized (this.l) {
                this.C++;
                this.o.addLast(uVar);
            }
        }
    }

    public void b(u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f15a22d0a44187c8f25fdd18faf0dc0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f15a22d0a44187c8f25fdd18faf0dc0b");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            uVar.a();
        } else {
            this.e.add(uVar);
        }
    }

    public NativeViewHierarchyManager a() {
        return this.j;
    }

    public final void a(int i2, View view) {
        Object[] objArr = {Integer.valueOf(i2), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e75701a4c71015f1b1b79cac6c924b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e75701a4c71015f1b1b79cac6c924b9");
        } else {
            a().a(i2, view);
        }
    }

    public final void a(int i2, Object obj) {
        Object[] objArr = {Integer.valueOf(i2), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2f1bfe78c64084b95ab1a54d7d9318a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2f1bfe78c64084b95ab1a54d7d9318a");
        } else {
            b(new x(i2, obj));
        }
    }

    public final void a(ThemedReactContext themedReactContext, int i2, String str, @Nullable ab abVar) {
        Object[] objArr = {themedReactContext, Integer.valueOf(i2), str, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a74bfbd80d29bc01291fb7cbe10481da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a74bfbd80d29bc01291fb7cbe10481da");
        } else {
            a(new c(themedReactContext, i2, str, abVar));
        }
    }

    public final void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7114046df14258c77e1a3656206c204", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7114046df14258c77e1a3656206c204");
        } else {
            b(new v(i2, i3, i4, i5, i6, i7, i8, str));
        }
    }

    public final void a(int i2, @Nullable int[] iArr, @Nullable aq[] aqVarArr, @Nullable int[] iArr2) {
        Object[] objArr = {Integer.valueOf(i2), iArr, aqVarArr, iArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "670b1287e28d32a9b4eb2309ebcaead6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "670b1287e28d32a9b4eb2309ebcaead6");
        } else {
            b(new k(i2, iArr, aqVarArr, iArr2));
        }
    }

    public final void a(aa aaVar, com.meituan.msc.uimanager.i iVar) {
        Object[] objArr = {aaVar, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73647689030be0805434f2b8984ac846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73647689030be0805434f2b8984ac846");
        } else {
            this.e.add(new j(aaVar, iVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.meituan.robust.ChangeQuickRedirect] */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final void a(final int i2, final long j2, final long j3) {
        final long uptimeMillis;
        final long currentThreadTimeMillis;
        final ArrayList<f> arrayList;
        final ArrayList<u> arrayList2;
        final ArrayDeque<u> arrayDeque;
        Object[] objArr = {Integer.valueOf(i2), new Long(j2), new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        long j4 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, j4, false, "9478d04d71af48483c08c4b8e45028ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9478d04d71af48483c08c4b8e45028ce");
            return;
        }
        com.meituan.msc.systrace.b.a(0L, "UIViewOperationQueue.dispatchViewUpdates");
        try {
            uptimeMillis = SystemClock.uptimeMillis();
            currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            if (this.d.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList<f> arrayList3 = this.d;
                this.d = new ArrayList<>();
                arrayList = arrayList3;
            }
            if (this.e.isEmpty()) {
                arrayList2 = null;
            } else {
                ArrayList<u> arrayList4 = this.e;
                this.e = new ArrayList<>();
                arrayList2 = arrayList4;
            }
            synchronized (this.l) {
                try {
                    if (this.o.isEmpty()) {
                        arrayDeque = null;
                    } else {
                        ArrayDeque<u> arrayDeque2 = this.o;
                        this.o = new ArrayDeque<>();
                        arrayDeque = arrayDeque2;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            j4 = 0;
        }
        try {
            Runnable runnable = new Runnable() { // from class: com.meituan.msc.uimanager.UIViewOperationQueue.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79c2fbf8ea06e1b5467d1b60666e5ff7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79c2fbf8ea06e1b5467d1b60666e5ff7");
                        return;
                    }
                    com.meituan.msc.systrace.b.a(0L, "DispatchUI");
                    try {
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        if (arrayList != null) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                f fVar = (f) it.next();
                                try {
                                    fVar.b();
                                } catch (RetryableMountingLayerException e2) {
                                    if (fVar.d() != 0) {
                                        ReactSoftException.logSoftException(UIViewOperationQueue.h, new com.meituan.msc.exception.b(e2));
                                    } else {
                                        fVar.c();
                                        UIViewOperationQueue.this.d.add(fVar);
                                    }
                                } catch (Throwable th3) {
                                    ReactSoftException.logSoftException(UIViewOperationQueue.h, th3);
                                }
                            }
                        }
                        if (arrayDeque != null) {
                            Iterator it2 = arrayDeque.iterator();
                            while (it2.hasNext()) {
                                u uVar = (u) it2.next();
                                if (uVar != null) {
                                    uVar.a();
                                } else {
                                    com.meituan.msc.modules.reporter.g.a(UIViewOperationQueue.h, "op is null nonBatchedOperations");
                                }
                            }
                        }
                        if (arrayList2 != null) {
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                u uVar2 = (u) it3.next();
                                if (uVar2 != null) {
                                    uVar2.a();
                                } else {
                                    com.meituan.msc.modules.reporter.g.a(UIViewOperationQueue.h, "op is null batchedOperations");
                                }
                            }
                        }
                        RenderPerf d2 = UIViewOperationQueue.d(UIViewOperationQueue.this);
                        if (d2 != null) {
                            d2.b(i2).m = System.currentTimeMillis();
                        }
                        if (UIViewOperationQueue.this.r && UIViewOperationQueue.this.t == 0) {
                            UIViewOperationQueue.this.t = j2;
                            UIViewOperationQueue.this.u = SystemClock.uptimeMillis();
                            UIViewOperationQueue.this.v = j3;
                            UIViewOperationQueue.this.w = uptimeMillis;
                            UIViewOperationQueue.this.x = uptimeMillis2;
                            UIViewOperationQueue.this.y = UIViewOperationQueue.this.u;
                            UIViewOperationQueue.this.B = currentThreadTimeMillis;
                            long unused = UIViewOperationQueue.this.t;
                            long unused2 = UIViewOperationQueue.this.w;
                            long unused3 = UIViewOperationQueue.this.w;
                            long unused4 = UIViewOperationQueue.this.x;
                        }
                        NativeViewHierarchyManager a2 = UIViewOperationQueue.this.a();
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = NativeViewHierarchyManager.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "a48b9dea414a5d3dc6712afe17cf35c5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "a48b9dea414a5d3dc6712afe17cf35c5");
                        } else {
                            a2.c.a();
                        }
                        if (UIViewOperationQueue.this.p != null) {
                            com.meituan.msc.uimanager.debug.a unused5 = UIViewOperationQueue.this.p;
                        }
                    } catch (Exception e3) {
                        if (UIViewOperationQueue.this.m != null && (e3 instanceof JSApplicationIllegalArgumentException)) {
                            UIViewOperationQueue.this.m.handleException(e3);
                        } else {
                            UIViewOperationQueue.a(UIViewOperationQueue.this, true);
                            throw new com.meituan.msc.d(e3);
                        }
                    } finally {
                        com.meituan.msc.systrace.a.a(0L);
                    }
                }
            };
            j4 = 0;
            com.meituan.msc.systrace.b.a(0L, "acquiring mDispatchRunnablesLock");
            synchronized (this.k) {
                com.meituan.msc.systrace.a.a(0L);
                this.n.add(runnable);
            }
            if (!this.f) {
                UiThreadUtil.runOnUiThread(new GuardedRunnable(this.m) { // from class: com.meituan.msc.uimanager.UIViewOperationQueue.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.jse.bridge.GuardedRunnable
                    public final void runGuarded() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7c601995f093f8a9292f45e8df1297a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7c601995f093f8a9292f45e8df1297a");
                        } else {
                            UIViewOperationQueue.this.b();
                        }
                    }
                });
            }
            com.meituan.msc.systrace.a.a(0L);
        } catch (Throwable th3) {
            th = th3;
            j4 = 0;
            com.meituan.msc.systrace.a.a(j4);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2bf4a466401f44427ebaad477b14b2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2bf4a466401f44427ebaad477b14b2c");
        } else if (this.q) {
            com.meituan.msc.modules.reporter.g.e("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
        } else {
            synchronized (this.k) {
                if (this.n.isEmpty()) {
                    return;
                }
                ArrayList<Runnable> arrayList = this.n;
                this.n = new ArrayList<>();
                long uptimeMillis = SystemClock.uptimeMillis();
                Iterator<Runnable> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                if (this.r) {
                    this.z = SystemClock.uptimeMillis() - uptimeMillis;
                    this.A = this.s;
                    this.r = false;
                }
                this.s = 0L;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class h extends com.meituan.msc.uimanager.d {
        public static ChangeQuickRedirect c;
        private final int e;

        private h(ReactContext reactContext, int i) {
            super(reactContext);
            Object[] objArr = {UIViewOperationQueue.this, reactContext, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aac2a61bf66ed944eef9dc4a089d68a6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aac2a61bf66ed944eef9dc4a089d68a6");
            } else {
                this.e = i;
            }
        }

        @Override // com.meituan.msc.uimanager.d
        public final void b(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41c6be60e3fd86537c11229ae6088aae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41c6be60e3fd86537c11229ae6088aae");
            } else if (UIViewOperationQueue.this.q) {
                com.meituan.msc.modules.reporter.g.e("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            } else {
                com.meituan.msc.systrace.a.a(0L, "dispatchNonBatchedUIOperations");
                try {
                    c(j);
                    com.meituan.msc.systrace.a.a(0L);
                    UIViewOperationQueue.this.b();
                    com.meituan.msc.jse.modules.core.c.b().a(c.a.DISPATCH_UI, this);
                } catch (Throwable th) {
                    com.meituan.msc.systrace.a.a(0L);
                    throw th;
                }
            }
        }

        private void c(long j) {
            u uVar;
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8668447a9d968c32f5d7d43fb9bbe700", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8668447a9d968c32f5d7d43fb9bbe700");
                return;
            }
            while (16 - ((System.nanoTime() - j) / 1000000) >= this.e) {
                synchronized (UIViewOperationQueue.this.l) {
                    if (UIViewOperationQueue.this.o.isEmpty()) {
                        return;
                    }
                    uVar = (u) UIViewOperationQueue.this.o.pollFirst();
                }
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    uVar.a();
                    UIViewOperationQueue.this.s += SystemClock.uptimeMillis() - uptimeMillis;
                } catch (Exception e) {
                    if (UIViewOperationQueue.this.m != null && (e instanceof JSApplicationIllegalArgumentException)) {
                        UIViewOperationQueue.this.m.handleException(e);
                    } else {
                        UIViewOperationQueue.a(UIViewOperationQueue.this, true);
                        throw new com.meituan.msc.d(e);
                    }
                }
            }
        }
    }
}
