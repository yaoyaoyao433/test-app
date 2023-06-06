package com.meituan.android.msc.yoga;

import com.meituan.android.msc.csslib.CSSParserNative;
import com.meituan.android.msc.proguard.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes2.dex */
public abstract class YogaNodeJNIBase extends o implements Cloneable {
    public static ChangeQuickRedirect a;
    @DoNotStrip
    @Nullable
    private float[] arr;
    @Nullable
    protected YogaNodeJNIBase b;
    @Nullable
    protected List<YogaNodeJNIBase> c;
    protected long d;
    @Nullable
    private l e;
    @Nullable
    private b f;
    @Nullable
    private Object g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    @DoNotStrip
    private int mLayoutDirection;

    private void a(o oVar) {
        Object[] objArr = {oVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af0fb97643493b972a9363f8489e16d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af0fb97643493b972a9363f8489e16d1");
        }
    }

    private YogaNodeJNIBase(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f5380a1d3aae2ad50579c296432da86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f5380a1d3aae2ad50579c296432da86");
            return;
        }
        this.arr = null;
        this.mLayoutDirection = 0;
        this.h = true;
        this.i = true;
        this.j = false;
        this.k = 0;
        this.l = 0;
        if (j == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.d = j;
    }

    public YogaNodeJNIBase() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff86a34d3a519045c64c49c49f64f7bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff86a34d3a519045c64c49c49f64f7bf");
            return;
        }
        this.arr = null;
        this.mLayoutDirection = 0;
        this.h = true;
        this.i = true;
        this.j = false;
        this.k = 0;
        this.l = 0;
    }

    public YogaNodeJNIBase(c cVar) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((d) cVar).c));
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "950bc2c01b8dd79aa30e29ecef82a604", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "950bc2c01b8dd79aa30e29ecef82a604");
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public long a() {
        return this.d;
    }

    @Override // com.meituan.android.msc.yoga.o
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c77199b0798a596ec0bce91d9241c803", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c77199b0798a596ec0bce91d9241c803");
            return;
        }
        this.k = i;
        YogaNative.jni_YGNodeSetRNTag(this.d, i);
    }

    @Override // com.meituan.android.msc.yoga.o
    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c63782b148ae17594978eac3d2fdb4dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c63782b148ae17594978eac3d2fdb4dd");
            return;
        }
        this.l = i;
        YogaNative.jni_YGNodeSetZIndex(this.d, i);
    }

    @Override // com.meituan.android.msc.yoga.o
    public void a(o oVar, int i) {
        Object[] objArr = {oVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8384fcf73aee7b347737897bf8e2b599", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8384fcf73aee7b347737897bf8e2b599");
        } else if (oVar instanceof YogaNodeJNIBase) {
            if (oVar.c()) {
                System.out.println("");
            }
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) oVar;
            if (yogaNodeJNIBase.b != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (this.c == null) {
                this.c = new ArrayList(4);
            }
            this.c.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.b = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.d, yogaNodeJNIBase.d, i);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c833e60eff99bdb712f0d893f7df184f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c833e60eff99bdb712f0d893f7df184f");
            return;
        }
        this.j = z;
        YogaNative.jni_YGNodeSetIsVirtual(this.d, z);
    }

    @Override // com.meituan.android.msc.yoga.o
    public boolean c() {
        return this.j;
    }

    @Override // com.meituan.android.msc.yoga.o
    public List<Integer> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8704d6433810d730854d20f81f7ff28", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8704d6433810d730854d20f81f7ff28");
        }
        int[] jni_YGNodeGetAllSortedDrawingChildrenRNTags = YogaNative.jni_YGNodeGetAllSortedDrawingChildrenRNTags(this.d);
        ArrayList arrayList = new ArrayList();
        if (jni_YGNodeGetAllSortedDrawingChildrenRNTags != null) {
            for (int i : jni_YGNodeGetAllSortedDrawingChildrenRNTags) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    @Override // com.meituan.android.msc.yoga.o
    /* renamed from: e */
    public YogaNodeJNIBase c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5951d0109a6233ff507e800cfb35e45f", RobustBitConfig.DEFAULT_VALUE)) {
            return (YogaNodeJNIBase) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5951d0109a6233ff507e800cfb35e45f");
        }
        if (this.c == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase remove = this.c.remove(i);
        remove.b = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.d, remove.d);
        return remove;
    }

    @Override // com.meituan.android.msc.yoga.o
    public final o d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04192c41439a28b22e2400c206ce922c", RobustBitConfig.DEFAULT_VALUE)) {
            return (o) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04192c41439a28b22e2400c206ce922c");
        }
        if (this.c == null) {
            throw new IllegalStateException("Trying to removeChildWithoutPositionOP a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase remove = this.c.remove(i);
        remove.b = null;
        YogaNative.jni_YGNodeRemoveChildWithoutPositionOPJNI(this.d, remove.d);
        return remove;
    }

    @Override // com.meituan.android.msc.yoga.o
    public void a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29e0cd05a7b2d819e4268883c2e4a76a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29e0cd05a7b2d819e4268883c2e4a76a");
            return;
        }
        a((o) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.c;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.a((o) yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].d;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.d, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.meituan.android.msc.yoga.o
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6caf777a261bfea14bb1c17010ccf6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6caf777a261bfea14bb1c17010ccf6f");
        } else {
            YogaNative.jni_YGNodeMarkDirtyJNI(this.d);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b52399bed0765690d1a919a6689035a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b52399bed0765690d1a919a6689035a")).booleanValue() : YogaNative.jni_YGNodeIsDirtyJNI(this.d);
    }

    @Override // com.meituan.android.msc.yoga.o
    public void a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39631c091de35d44b880ecec396fa9db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39631c091de35d44b880ecec396fa9db");
        } else {
            YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.d, jVar.f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45fd34809a96d39145a75732fa64fafc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45fd34809a96d39145a75732fa64fafc");
        } else {
            YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.d, kVar.h);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae5893b979a57ab977f23a93619f4ffe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae5893b979a57ab977f23a93619f4ffe");
        } else {
            YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.d, aVar.k);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aee21a959c12a4ffcacf96c27bc1970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aee21a959c12a4ffcacf96c27bc1970");
        } else {
            YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.d, aVar.k);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void c(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eacf7dd74e7f823c240b79a5a8bc3e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eacf7dd74e7f823c240b79a5a8bc3e1");
        } else {
            YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.d, aVar.k);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public r j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0811d9a0dda604ac0f8afb804562e146", RobustBitConfig.DEFAULT_VALUE) ? (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0811d9a0dda604ac0f8afb804562e146") : r.a(YogaNative.jni_YGNodeStyleGetPositionTypeJNI(this.d));
    }

    @Override // com.meituan.android.msc.yoga.o
    public void a(r rVar) {
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfc09b2d4e1469604e242e66dd89d406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfc09b2d4e1469604e242e66dd89d406");
        } else {
            YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.d, rVar.f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void a(u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c615496ab836023ba86be9c2f70075a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c615496ab836023ba86be9c2f70075a");
        } else {
            YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.d, uVar.e);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void a(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a380d786c092aefa449c4e483e76c34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a380d786c092aefa449c4e483e76c34");
        } else {
            YogaNative.jni_YGNodeStyleSetOverflowJNI(this.d, qVar.e);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf9820b32592a77a64cb7bb551067893", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf9820b32592a77a64cb7bb551067893");
        } else {
            YogaNative.jni_YGNodeStyleSetDisplayJNI(this.d, hVar.h);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd767a8cd86f0f0b693f7d41b79bc1ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd767a8cd86f0f0b693f7d41b79bc1ab");
        } else {
            YogaNative.jni_YGNodeSetIsRootViewFuncJNI(this.d, z);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d3f25f396d99c3bfdb995ae3a8bb238", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d3f25f396d99c3bfdb995ae3a8bb238")).booleanValue() : YogaNative.jni_YGNodeIsRootViewFuncJNI(this.d);
    }

    @Override // com.meituan.android.msc.yoga.o
    public void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fed44ad153453beb96f4f366a5de899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fed44ad153453beb96f4f366a5de899");
        } else {
            YogaNative.jni_YGNodeStyleSetFlexJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e676c15f378230b872cc856dd0523b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e676c15f378230b872cc856dd0523b");
        } else {
            YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void c(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6226b389db56c30a72bf5b0bdf67afb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6226b389db56c30a72bf5b0bdf67afb");
        } else {
            YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void d(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6733a605b009e812b97b35390fe0f4d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6733a605b009e812b97b35390fe0f4d6");
        } else {
            YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void e(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d913ad5aabe387279a3438628c1f2beb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d913ad5aabe387279a3438628c1f2beb");
        } else {
            YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46267cd77cb188904889217d5d5fbc00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46267cd77cb188904889217d5d5fbc00");
        } else {
            YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.d);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void a(i iVar, float f) {
        Object[] objArr = {iVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab80ead53b735c39ca86d6537bfc3dcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab80ead53b735c39ca86d6537bfc3dcd");
        } else {
            YogaNative.jni_YGNodeStyleSetMarginJNI(this.d, iVar.k, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void b(i iVar, float f) {
        Object[] objArr = {iVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d614398bee3dc884a833aa127024290b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d614398bee3dc884a833aa127024290b");
        } else {
            YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.d, iVar.k, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void a(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d66c0dc88747f50553c0a03d65f8adf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d66c0dc88747f50553c0a03d65f8adf");
        } else {
            YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.d, iVar.k);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void c(i iVar, float f) {
        Object[] objArr = {iVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2324f137db68f99a47f5d69238fbd0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2324f137db68f99a47f5d69238fbd0b");
        } else {
            YogaNative.jni_YGNodeStyleSetPaddingJNI(this.d, iVar.k, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void d(i iVar, float f) {
        Object[] objArr = {iVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bbd38098b9dddc4fd85c0bbb2eb4975", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bbd38098b9dddc4fd85c0bbb2eb4975");
        } else {
            YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.d, iVar.k, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void e(i iVar, float f) {
        Object[] objArr = {iVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49e0c32165e67ce977e3dcc8c1ed80ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49e0c32165e67ce977e3dcc8c1ed80ce");
        } else {
            YogaNative.jni_YGNodeStyleSetBorderJNI(this.d, iVar.k, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void f(i iVar, float f) {
        Object[] objArr = {iVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34a671ad89a796859197ba4660909522", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34a671ad89a796859197ba4660909522");
        } else {
            YogaNative.jni_YGNodeStyleSetPositionJNI(this.d, iVar.k, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void g(i iVar, float f) {
        Object[] objArr = {iVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbe480ff9c52fc1ddf020bbe450b9691", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbe480ff9c52fc1ddf020bbe450b9691");
        } else {
            YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.d, iVar.k, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public t m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "843dac2455793cc370eba6a5f2e752e4", RobustBitConfig.DEFAULT_VALUE) ? (t) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "843dac2455793cc370eba6a5f2e752e4") : a(YogaNative.jni_YGNodeStyleGetWidthJNI(this.d));
    }

    @Override // com.meituan.android.msc.yoga.o
    public void f(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27a28a2a2cc0dc8c5eefd3badf03d2dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27a28a2a2cc0dc8c5eefd3badf03d2dc");
        } else {
            YogaNative.jni_YGNodeStyleSetWidthJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void g(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09dce2d7349de9e0b095f60b0d79ccd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09dce2d7349de9e0b095f60b0d79ccd1");
        } else {
            YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c53f25302583a1593231393da32aea3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c53f25302583a1593231393da32aea3d");
        } else {
            YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.d);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public t o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6090bfa97b56e0595b79bbd8bc80358", RobustBitConfig.DEFAULT_VALUE) ? (t) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6090bfa97b56e0595b79bbd8bc80358") : a(YogaNative.jni_YGNodeStyleGetHeightJNI(this.d));
    }

    @Override // com.meituan.android.msc.yoga.o
    public void h(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d64dab8c43259f4aeef94d95213d68a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d64dab8c43259f4aeef94d95213d68a");
        } else {
            YogaNative.jni_YGNodeStyleSetHeightJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void i(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cdf63a2898bb0efb529c9ebfe94defe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cdf63a2898bb0efb529c9ebfe94defe");
        } else {
            YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d33d43cd06838697a3f6facd3dbf859", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d33d43cd06838697a3f6facd3dbf859");
        } else {
            YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.d);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void j(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b26b26139572099143c11c49b5190087", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b26b26139572099143c11c49b5190087");
        } else {
            YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void k(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cbc20388b53330ce855b32631b21183", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cbc20388b53330ce855b32631b21183");
        } else {
            YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void l(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eb31842f75a4893219c8e4449007ad5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eb31842f75a4893219c8e4449007ad5");
        } else {
            YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void m(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe80202457f03a93a3a3c8630b5e4b6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe80202457f03a93a3a3c8630b5e4b6b");
        } else {
            YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void n(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24702d3f4837747950bd27d8292c09bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24702d3f4837747950bd27d8292c09bc");
        } else {
            YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void o(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ac8f9b5c0621050a941c6500fd3f171", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ac8f9b5c0621050a941c6500fd3f171");
        } else {
            YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void p(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fac53be7f7eb1a97c409014ba077aed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fac53be7f7eb1a97c409014ba077aed");
        } else {
            YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void q(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44a902a78a4e663247da1b6753207314", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44a902a78a4e663247da1b6753207314");
        } else {
            YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void r(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b2e3c3dbc944516108163373b8394d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b2e3c3dbc944516108163373b8394d2");
        } else {
            YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.d, f);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void a(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8575545301f1ac512f0497bd745f9a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8575545301f1ac512f0497bd745f9a0");
            return;
        }
        this.e = lVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.d, lVar != null);
    }

    @DoNotStrip
    public final long measure(float f, int i, float f2, int i2) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74a204b4062a710893c23d3f0413bf0a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74a204b4062a710893c23d3f0413bf0a")).longValue();
        }
        if (!v()) {
            throw new RuntimeException("Measure function isn't defined!");
        }
        return this.e.a(this, f, m.a(i), f2, m.a(i2));
    }

    @DoNotStrip
    public final float baseline(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4f790600c559afe3972c676cec5587d", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4f790600c559afe3972c676cec5587d")).floatValue() : this.f.a(this, f, f2);
    }

    @Override // com.meituan.android.msc.yoga.o
    public boolean v() {
        return this.e != null;
    }

    @Override // com.meituan.android.msc.yoga.o
    public void a(Object obj) {
        this.g = obj;
    }

    @DoNotStrip
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        Object[] objArr = {yogaNodeJNIBase, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f59786f24ee867ce021a6970f51d8c22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f59786f24ee867ce021a6970f51d8c22")).longValue();
        }
        if (this.c == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        this.c.remove(i);
        this.c.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.b = this;
        return yogaNodeJNIBase.d;
    }

    private static t a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d18b89e545b111f42736836eddbe121", RobustBitConfig.DEFAULT_VALUE) ? (t) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d18b89e545b111f42736836eddbe121") : new t(Float.intBitsToFloat((int) j), (int) (j >> 32));
    }

    @Override // com.meituan.android.msc.yoga.o
    public float q() {
        if (this.arr != null) {
            return this.arr[3];
        }
        return 0.0f;
    }

    @Override // com.meituan.android.msc.yoga.o
    public float r() {
        if (this.arr != null) {
            return this.arr[4];
        }
        return 0.0f;
    }

    @Override // com.meituan.android.msc.yoga.o
    public float s() {
        if (this.arr != null) {
            return this.arr[1];
        }
        return 0.0f;
    }

    @Override // com.meituan.android.msc.yoga.o
    public float t() {
        if (this.arr != null) {
            return this.arr[2];
        }
        return 0.0f;
    }

    @Override // com.meituan.android.msc.yoga.o
    public float b(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c70234f8e601e9cb3e73b95abbd82b1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c70234f8e601e9cb3e73b95abbd82b1")).floatValue();
        }
        if (this.arr == null || (((int) this.arr[0]) & 1) != 1) {
            return 0.0f;
        }
        switch (iVar) {
            case LEFT:
                return this.arr[6];
            case TOP:
                return this.arr[7];
            case RIGHT:
                return this.arr[8];
            case BOTTOM:
                return this.arr[9];
            case START:
                return u() == g.RTL ? this.arr[8] : this.arr[6];
            case END:
                return u() == g.RTL ? this.arr[6] : this.arr[8];
            default:
                throw new IllegalArgumentException("Cannot get layout margins of multi-edge shorthands");
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public float c(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ab9341ddba8b99d423df3d1c95bb735", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ab9341ddba8b99d423df3d1c95bb735")).floatValue();
        }
        if (this.arr == null || (((int) this.arr[0]) & 2) != 2) {
            return 0.0f;
        }
        int i = 10 - ((((int) this.arr[0]) & 1) != 1 ? 4 : 0);
        switch (iVar) {
            case LEFT:
                return this.arr[i];
            case TOP:
                return this.arr[i + 1];
            case RIGHT:
                return this.arr[i + 2];
            case BOTTOM:
                return this.arr[i + 3];
            case START:
                return u() == g.RTL ? this.arr[i + 2] : this.arr[i];
            case END:
                return u() == g.RTL ? this.arr[i] : this.arr[i + 2];
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public g u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d830a1f78226d3a9eed54b42220168e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d830a1f78226d3a9eed54b42220168e8");
        }
        return g.a(this.arr != null ? (int) this.arr[5] : this.mLayoutDirection);
    }

    @Override // com.meituan.android.msc.yoga.o
    public boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13041a19162d577c2f66bc3cb77ff3ff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13041a19162d577c2f66bc3cb77ff3ff")).booleanValue();
        }
        if (this.arr != null) {
            return (((int) this.arr[0]) & 16) == 16;
        }
        return this.h;
    }

    @Override // com.meituan.android.msc.yoga.o
    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f8cac6d4a638afefe1b4e60e95b0d8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f8cac6d4a638afefe1b4e60e95b0d8f");
            return;
        }
        if (this.arr != null) {
            this.arr[0] = ((int) this.arr[0]) & (-17);
        }
        this.h = false;
    }

    @Override // com.meituan.android.msc.yoga.o
    public boolean e() {
        if (this.arr != null) {
            return (((int) this.arr[0]) & 32) == 32;
        }
        return this.i;
    }

    @Override // com.meituan.android.msc.yoga.o
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dbf74ebd505ad3cd711b3bb5d80d183", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dbf74ebd505ad3cd711b3bb5d80d183");
            return;
        }
        if (this.arr != null) {
            this.arr[0] = ((int) this.arr[0]) & (-33);
        }
        this.i = false;
    }

    @Override // com.meituan.android.msc.yoga.o
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97ba507a55e808dd77c9c14973a9c1c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97ba507a55e808dd77c9c14973a9c1c9");
            return;
        }
        synchronized (CSSParserNative.b) {
            YogaNative.jni_YGNodeSetIdForStyle(this.d, str);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74b039effc571d3493d86bf368adef24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74b039effc571d3493d86bf368adef24");
            return;
        }
        synchronized (CSSParserNative.b) {
            YogaNative.jni_YGNodeSetClassNames(this.d, str);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a91e81ef703c621ff63dee8dfa72c516", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a91e81ef703c621ff63dee8dfa72c516");
            return;
        }
        synchronized (CSSParserNative.b) {
            YogaNative.jni_YGNodeSetInlineStyle(this.d, str);
        }
    }

    @Override // com.meituan.android.msc.yoga.o
    public void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "383e5547f3fcd52bcaa17c487ec5b7e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "383e5547f3fcd52bcaa17c487ec5b7e1");
            return;
        }
        synchronized (CSSParserNative.b) {
            YogaNative.jni_YGNodeSetViewTagName(this.d, str);
        }
    }
}
