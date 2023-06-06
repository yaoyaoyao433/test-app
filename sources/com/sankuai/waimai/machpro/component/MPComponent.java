package com.sankuai.waimai.machpro.component;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaMeasureFunction;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.recce.props.gens.BackgroundColor;
import com.meituan.android.recce.props.gens.BorderBottomColor;
import com.meituan.android.recce.props.gens.BorderBottomLeftRadius;
import com.meituan.android.recce.props.gens.BorderBottomRightRadius;
import com.meituan.android.recce.props.gens.BorderBottomWidth;
import com.meituan.android.recce.props.gens.BorderColor;
import com.meituan.android.recce.props.gens.BorderLeftColor;
import com.meituan.android.recce.props.gens.BorderLeftWidth;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.props.gens.BorderRightColor;
import com.meituan.android.recce.props.gens.BorderRightWidth;
import com.meituan.android.recce.props.gens.BorderStyle;
import com.meituan.android.recce.props.gens.BorderTopColor;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopRightRadius;
import com.meituan.android.recce.props.gens.BorderWidth;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.animator.i;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.g;
import com.sankuai.waimai.machpro.instance.MPContext;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public abstract class MPComponent<T extends View> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final com.sankuai.waimai.machpro.bridge.c callback;
    private LinkedList<Object> cssQueue;
    private Map<String, Object> endAttr;
    private boolean hasAnim;
    private boolean isAccessibilityClick;
    private boolean isListenerLayoutChange;
    private boolean isSetImportantForAccessibility;
    private com.sankuai.waimai.machpro.view.decoration.b mBackgroundDrawable;
    private float[] mBorderRadii;
    private String mBoxShadow;
    private ArrayList<MPComponent> mChildComponents;
    private f mClickListener;
    private Map<String, Object> mDataAttributes;
    private SparseArray<String> mDescriptionMap;
    private com.sankuai.waimai.machpro.view.b mHitslopDetegate;
    private String mLastCssClass;
    public MPContext mMachContext;
    private String mNativeId;
    protected long mNativeNodePtr;
    protected MPComponent mParentComponent;
    private Map<String, Object> mStyleProperty;
    private e mTouchDelegate;
    public T mView;
    public com.facebook.yoga.d mYogaNode;
    public final com.sankuai.waimai.machpro.animator.b mpAnimatorManager;
    private ArrayList<String> needTransitionAttrs;
    private boolean released;
    private Map<String, Object> startAttr;
    private HashMap<String, LinkedList<Object>> tmpStyleTransition;
    private HashMap<String, ArrayList<Map<String, Object>>> tmpTransitionMap;
    private ArrayList<Map<String, Object>> transitionAttrInfo;

    public abstract T createView();

    public void onAppendChild(MPComponent mPComponent, MPComponent mPComponent2) {
    }

    public void onAttachToParent() {
    }

    public MPComponent(MPContext mPContext) {
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56c10f95c91c808c30519bfe2dc44ada", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56c10f95c91c808c30519bfe2dc44ada");
            return;
        }
        this.mBorderRadii = new float[8];
        this.released = false;
        this.mStyleProperty = new HashMap();
        this.callback = new com.sankuai.waimai.machpro.bridge.c() { // from class: com.sankuai.waimai.machpro.component.MPComponent.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.bridge.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2b1a42a896564e701cd584f859ebf863", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2b1a42a896564e701cd584f859ebf863");
                } else if (MPComponent.this.canTransition()) {
                    if (MPComponent.this.tmpStyleTransition != null) {
                        Iterator it = MPComponent.this.needTransitionAttrs.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            LinkedList linkedList = (LinkedList) MPComponent.this.tmpStyleTransition.get(str);
                            if (linkedList != null && linkedList.size() == 2) {
                                MPComponent.this.startAttr.put(str, linkedList.getFirst());
                                MPComponent.this.endAttr.put(str, linkedList.getLast());
                                MPComponent.this.cssQueue.clear();
                            }
                        }
                    }
                    if (MPComponent.this.startAttr.size() <= 0 || MPComponent.this.endAttr.size() <= 0) {
                        return;
                    }
                    com.sankuai.waimai.machpro.animator.b bVar = MPComponent.this.mpAnimatorManager;
                    com.facebook.yoga.d dVar = MPComponent.this.mYogaNode;
                    Map<String, Object> map = MPComponent.this.startAttr;
                    Map<String, Object> map2 = MPComponent.this.endAttr;
                    ArrayList<Map<String, Object>> arrayList = MPComponent.this.transitionAttrInfo;
                    Object[] objArr3 = {dVar, map, map2, arrayList};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.machpro.animator.b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect4, false, "0b36e7c113ed5736d9ab0515c918c876", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect4, false, "0b36e7c113ed5736d9ab0515c918c876");
                    } else {
                        try {
                            i iVar = bVar.d.get(dVar.hashCode());
                            if (iVar == null) {
                                i iVar2 = new i(dVar);
                                iVar2.a(map, map2, arrayList);
                                bVar.d.put(dVar.hashCode(), iVar2);
                            } else {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = i.k;
                                if (PatchProxy.isSupport(objArr4, iVar, changeQuickRedirect5, false, "85ccef03f8dcc9cda46c59a402398358", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, iVar, changeQuickRedirect5, false, "85ccef03f8dcc9cda46c59a402398358");
                                } else if (iVar.l != null && iVar.l.size() > 0) {
                                    Iterator<Animator> it2 = iVar.l.iterator();
                                    while (it2.hasNext()) {
                                        it2.next().cancel();
                                    }
                                    iVar.l = null;
                                }
                                iVar.a(map, map2, arrayList);
                            }
                        } catch (Exception unused) {
                            com.sankuai.waimai.machpro.util.a.a("MPAnim", "TransitionAnim init Error");
                        }
                    }
                    com.sankuai.waimai.machpro.animator.b bVar2 = MPComponent.this.mpAnimatorManager;
                    int hashCode = MPComponent.this.mYogaNode.hashCode();
                    Object[] objArr5 = {Integer.valueOf(hashCode)};
                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.machpro.animator.b.a;
                    if (PatchProxy.isSupport(objArr5, bVar2, changeQuickRedirect6, false, "590aaebafa80fc4634d92a6f669b90dd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, bVar2, changeQuickRedirect6, false, "590aaebafa80fc4634d92a6f669b90dd");
                        return;
                    }
                    i iVar3 = bVar2.d.get(hashCode);
                    if (iVar3 != null) {
                        iVar3.b();
                    }
                }
            }
        };
        this.mMachContext = mPContext;
        this.mYogaNode = com.facebook.yoga.d.a();
        this.mYogaNode.a((YogaMeasureFunction) new com.sankuai.waimai.machpro.view.c());
        this.mYogaNode.a(YogaFlexDirection.ROW);
        this.mYogaNode.c(1.0f);
        this.mYogaNode.b(0.0f);
        this.mView = createView();
        this.mYogaNode.a(this.mView);
        this.mChildComponents = new ArrayList<>();
        this.mpAnimatorManager = this.mMachContext.getInstance().v;
        com.sankuai.waimai.machpro.instance.a mPContext2 = this.mMachContext.getInstance();
        com.sankuai.waimai.machpro.bridge.c cVar = this.callback;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.instance.a.a;
        if (PatchProxy.isSupport(objArr2, mPContext2, changeQuickRedirect3, false, "add75c8ba1ac2f8cf1c5b4e3ddb3209c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mPContext2, changeQuickRedirect3, false, "add75c8ba1ac2f8cf1c5b4e3ddb3209c");
        } else if (cVar != null) {
            if (mPContext2.m == null) {
                mPContext2.m = new LinkedList<>();
            }
            if (mPContext2.m.contains(cVar)) {
                return;
            }
            mPContext2.m.add(cVar);
        }
    }

    public void setNativeNodePtr(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e42dc57c7151964c15cd05743264c71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e42dc57c7151964c15cd05743264c71");
        } else {
            this.mNativeNodePtr = j;
        }
    }

    public T getView() {
        return this.mView;
    }

    public com.facebook.yoga.d getYogaNode() {
        return this.mYogaNode;
    }

    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90f4ddd70f763b229868f02f85960a9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90f4ddd70f763b229868f02f85960a9a");
            return;
        }
        markDirty();
        this.mView.requestLayout();
    }

    public void markDirty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e98e877ec0440f45746a0eb22c7c262", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e98e877ec0440f45746a0eb22c7c262");
        } else if (this.mYogaNode == null || this.mYogaNode.c() > 0) {
        } else {
            if (!this.mYogaNode.v()) {
                this.mYogaNode.a((YogaMeasureFunction) new com.sankuai.waimai.machpro.view.c());
            }
            this.mYogaNode.f();
        }
    }

    private void appendChildComponent(MPComponent mPComponent, MPComponent mPComponent2) {
        Object[] objArr = {mPComponent, mPComponent2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b639f3b3c1b9bafc6e69faf33eb2fe2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b639f3b3c1b9bafc6e69faf33eb2fe2");
        } else if (mPComponent == null) {
        } else {
            if (mPComponent instanceof a) {
                mPComponent.onAttachToParent();
                return;
            }
            if (mPComponent.mParentComponent != null) {
                mPComponent.removeFromParentComponent();
            }
            this.mChildComponents.add(mPComponent);
            mPComponent.mParentComponent = this;
            onAppendChild(mPComponent, mPComponent2);
            mPComponent.onAttachToParent();
        }
    }

    private void removeFromParentComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73b354cd2acb3fbaa7ff02fdd5dbdbc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73b354cd2acb3fbaa7ff02fdd5dbdbc0");
        } else if (this.mParentComponent != null) {
            this.mParentComponent.removeChild(this);
        }
    }

    public List<MPComponent> getChildComponent() {
        return this.mChildComponents;
    }

    public MPComponent getParentComponent() {
        return this.mParentComponent;
    }

    public String getNativeId() {
        return this.mNativeId;
    }

    public void removeChild(MPComponent mPComponent) {
        Object[] objArr = {mPComponent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9463a775a23846b0208ce0ed39dde533", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9463a775a23846b0208ce0ed39dde533");
        } else if (mPComponent instanceof a) {
            mPComponent.onDetachFromParent();
        } else if (mPComponent == null || mPComponent.mParentComponent != this) {
        } else {
            this.mChildComponents.remove(mPComponent);
            mPComponent.mParentComponent = null;
            onRemoveChild(mPComponent);
            mPComponent.onDetachFromParent();
        }
    }

    public void onRemoveChild(MPComponent mPComponent) {
        Object[] objArr = {mPComponent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e9068bf9716a844fb7f1e3d6cc213bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e9068bf9716a844fb7f1e3d6cc213bd");
        } else if (this.mHitslopDetegate == null || mPComponent.getView() == null) {
        } else {
            this.mHitslopDetegate.a(mPComponent.getView());
        }
    }

    public void onDetachFromParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "010e391c2a5f23187eeda291f617255f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "010e391c2a5f23187eeda291f617255f");
        } else if (this.mpAnimatorManager != null) {
            com.sankuai.waimai.machpro.animator.b bVar = this.mpAnimatorManager;
            int hashCode = this.mYogaNode.hashCode();
            Object[] objArr2 = {Integer.valueOf(hashCode)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.animator.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "69b2492e3a7e78d66708ecf134e58f70", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "69b2492e3a7e78d66708ecf134e58f70");
                return;
            }
            com.sankuai.waimai.machpro.animator.d dVar = bVar.b.get(hashCode);
            if (dVar != null) {
                dVar.cancel();
                bVar.b.remove(hashCode);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void addEventListener(String str) {
        char c;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58b42ef25ef0f8a38c9affe7e6b0f6a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58b42ef25ef0f8a38c9affe7e6b0f6a3");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            switch (str.hashCode()) {
                case -1643834313:
                    if (str.equals("doubleClick")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1109722326:
                    if (str.equals("layout")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -322386034:
                    if (str.equals("dragStart")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3091764:
                    if (str.equals("drag")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 94750088:
                    if (str.equals("click")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 114203431:
                    if (str.equals("longPress")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1138865370:
                    if (str.equals("accessibilityClick")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1146562627:
                    if (str.equals("shouldStartDrag")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1912497927:
                    if (str.equals("dragEnd")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    initClickListener();
                    return;
                case 1:
                    this.mView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.sankuai.waimai.machpro.component.MPComponent.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1c731ae14064f0abc94670ae1f4a0a9c", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1c731ae14064f0abc94670ae1f4a0a9c")).booleanValue();
                            }
                            MPComponent.this.dispatchEvent("longPress", null);
                            return true;
                        }
                    });
                    return;
                case 2:
                case 3:
                case 4:
                    initTouchListener();
                    if (this.mTouchDelegate.b == null) {
                        this.mTouchDelegate.b = new c(this);
                        return;
                    }
                    return;
                case 5:
                    initTouchListener();
                    if (this.mTouchDelegate.b == null) {
                        this.mTouchDelegate.b = new c(this);
                    }
                    this.mTouchDelegate.b.b = true;
                    return;
                case 6:
                    initClickListener();
                    this.mClickListener.b = true;
                    return;
                case 7:
                    this.isListenerLayoutChange = true;
                    return;
                case '\b':
                    this.isAccessibilityClick = true;
                    initClickListener();
                    return;
                default:
                    return;
            }
        }
    }

    public boolean isAccessibilityClick() {
        return this.isAccessibilityClick;
    }

    private void initTouchListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef3bd7e50106b3c96b41519a07a2653e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef3bd7e50106b3c96b41519a07a2653e");
        } else if (this.mTouchDelegate == null) {
            this.mTouchDelegate = new e();
            this.mView.setOnTouchListener(this.mTouchDelegate);
        }
    }

    private void initClickListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7aaa50cb14aeeb6334dd25d30bb09093", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7aaa50cb14aeeb6334dd25d30bb09093");
            return;
        }
        if (this.mClickListener == null) {
            this.mClickListener = new f(this);
        }
        this.mView.setOnClickListener(this.mClickListener);
    }

    public Object dispatchEvent(String str, MachArray machArray) {
        Object[] objArr = {str, machArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82ad696aad3524185a85c3fcca0cf8eb", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82ad696aad3524185a85c3fcca0cf8eb");
        }
        if (this.released || TextUtils.isEmpty(str)) {
            return null;
        }
        if (machArray == null) {
            machArray = new MachArray();
        }
        machArray.add(0, str);
        return this.mMachContext.getJSContext().a(this.mNativeNodePtr, "dispatchEvent", machArray);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r13.equals("longPress") == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void removeEventListener(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.machpro.component.MPComponent.changeQuickRedirect
            java.lang.String r11 = "65be10d257db089e1b7f8af00ab0270d"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 == 0) goto L22
            return
        L22:
            java.lang.String r1 = "click"
            boolean r1 = r1.equals(r13)
            r2 = 0
            if (r1 == 0) goto L30
            T extends android.view.View r1 = r12.mView
            r1.setOnClickListener(r2)
        L30:
            r1 = -1
            int r3 = r13.hashCode()
            r4 = -1109722326(0xffffffffbddafb2a, float:-0.10692437)
            if (r3 == r4) goto L59
            r4 = 94750088(0x5a5c588, float:1.5589087E-35)
            if (r3 == r4) goto L4f
            r4 = 114203431(0x6ce9b27, float:7.7716563E-35)
            if (r3 == r4) goto L45
            goto L64
        L45:
            java.lang.String r3 = "longPress"
            boolean r13 = r13.equals(r3)
            if (r13 == 0) goto L64
            goto L65
        L4f:
            java.lang.String r0 = "click"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L64
            r0 = 0
            goto L65
        L59:
            java.lang.String r0 = "layout"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L64
            r0 = 2
            goto L65
        L64:
            r0 = -1
        L65:
            switch(r0) {
                case 0: goto L72;
                case 1: goto L6c;
                case 2: goto L69;
                default: goto L68;
            }
        L68:
            goto L78
        L69:
            r12.isListenerLayoutChange = r9
            goto L78
        L6c:
            T extends android.view.View r13 = r12.mView
            r13.setOnLongClickListener(r2)
            return
        L72:
            T extends android.view.View r13 = r12.mView
            r13.setOnClickListener(r2)
            return
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.MPComponent.removeEventListener(java.lang.String):void");
    }

    private void safeSetAttribute(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "540679aeabf74323045765af5686d09b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "540679aeabf74323045765af5686d09b");
            return;
        }
        try {
            updateAttribute(str, obj);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("updateAttribute exception-->" + e.getMessage() + "\n" + Log.getStackTraceString(e));
        }
    }

    public void updateAttribute(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9868cf5b0da837241032dcd9f7f0dd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9868cf5b0da837241032dcd9f7f0dd8");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case -1141400650:
                    if (str.equals("accessible")) {
                        c = 1;
                        break;
                    }
                    break;
                case -101663499:
                    if (str.equals("accessibilityHint")) {
                        c = 4;
                        break;
                    }
                    break;
                case -100710187:
                    if (str.equals("accessibilityhint")) {
                        c = 3;
                        break;
                    }
                    break;
                case 94742904:
                    if (str.equals(CommonConstant.File.CLASS)) {
                        c = 0;
                        break;
                    }
                    break;
                case 244143516:
                    if (str.equals("hoverClass")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 746986311:
                    if (str.equals("importantForAccessibility")) {
                        c = 2;
                        break;
                    }
                    break;
                case 926871597:
                    if (str.equals("hitSlop")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1146842694:
                    if (str.equals("accessibilityLabel")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1176395366:
                    if (str.equals("accessibilitylabel")) {
                        c = 5;
                        break;
                    }
                    break;
                case 2045685618:
                    if (str.equals("nativeID")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    updateClass(com.sankuai.waimai.machpro.util.b.a(obj, ""));
                    return;
                case 1:
                    boolean d = com.sankuai.waimai.machpro.util.b.d(obj);
                    this.mView.setFocusable(d);
                    if (this.isSetImportantForAccessibility) {
                        return;
                    }
                    if (d) {
                        this.mView.setImportantForAccessibility(1);
                        return;
                    } else {
                        this.mView.setImportantForAccessibility(2);
                        return;
                    }
                case 2:
                    setImportantForAccessibility(com.sankuai.waimai.machpro.util.b.a(obj, ""));
                    return;
                case 3:
                case 4:
                    if (this.mDescriptionMap == null) {
                        this.mDescriptionMap = new SparseArray<>();
                    }
                    this.mDescriptionMap.put(2, com.sankuai.waimai.machpro.util.b.a(obj, ""));
                    updateContentDescription();
                    return;
                case 5:
                case 6:
                    if (this.mDescriptionMap == null) {
                        this.mDescriptionMap = new SparseArray<>();
                    }
                    this.mDescriptionMap.put(1, com.sankuai.waimai.machpro.util.b.a(obj, ""));
                    updateContentDescription();
                    return;
                case 7:
                    String a = com.sankuai.waimai.machpro.util.b.a(obj, "");
                    if (this.mMachContext.getInstance() == null || TextUtils.isEmpty(a)) {
                        return;
                    }
                    this.mNativeId = a;
                    com.sankuai.waimai.machpro.instance.a mPContext = this.mMachContext.getInstance();
                    Object[] objArr2 = {a, this};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.instance.a.a;
                    if (PatchProxy.isSupport(objArr2, mPContext, changeQuickRedirect3, false, "0b14bf6528bbf27e0f0ae9568dac4733", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, mPContext, changeQuickRedirect3, false, "0b14bf6528bbf27e0f0ae9568dac4733");
                        return;
                    } else if (TextUtils.isEmpty(a)) {
                        return;
                    } else {
                        mPContext.x.put(a, new WeakReference<>(this));
                        return;
                    }
                case '\b':
                    if (this.mMachContext.getInstance() == null || !(obj instanceof MachMap)) {
                        return;
                    }
                    MachMap machMap = (MachMap) obj;
                    final int a2 = (int) com.sankuai.waimai.machpro.util.b.a(machMap.get("left"));
                    final int a3 = (int) com.sankuai.waimai.machpro.util.b.a(machMap.get("top"));
                    final int a4 = (int) com.sankuai.waimai.machpro.util.b.a(machMap.get("right"));
                    final int a5 = (int) com.sankuai.waimai.machpro.util.b.a(machMap.get("bottom"));
                    if (this.mParentComponent != null && this.mParentComponent.getView() != null) {
                        this.mParentComponent.addHitSlop(this.mView, a2, a3, a4, a5);
                        return;
                    } else {
                        com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.machpro.component.MPComponent.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "395f2a43bfe2afd71f96ca917786c62e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "395f2a43bfe2afd71f96ca917786c62e");
                                } else if (MPComponent.this.mParentComponent == null || MPComponent.this.mParentComponent.getView() == null) {
                                } else {
                                    MPComponent.this.mParentComponent.addHitSlop(MPComponent.this.mView, a2, a3, a4, a5);
                                }
                            }
                        });
                        return;
                    }
                case '\t':
                    setHoverClass(com.sankuai.waimai.machpro.util.b.a(obj, ""));
                    return;
                default:
                    if (str.startsWith("data-")) {
                        if (this.mDataAttributes == null) {
                            this.mDataAttributes = new HashMap();
                        }
                        this.mDataAttributes.put(str, obj);
                        return;
                    }
                    return;
            }
        }
    }

    private void setImportantForAccessibility(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c05dd632335599c0423dd01d170e9173", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c05dd632335599c0423dd01d170e9173");
            return;
        }
        this.isSetImportantForAccessibility = true;
        if (FpsEvent.TYPE_SCROLL_AUTO.equals(str)) {
            this.mView.setImportantForAccessibility(0);
        } else if ("yes".equals(str)) {
            this.mView.setImportantForAccessibility(1);
        } else if ("no".equals(str)) {
            this.mView.setImportantForAccessibility(2);
        } else if ("no-hide-descendants".equals(str)) {
            this.mView.setImportantForAccessibility(4);
        }
    }

    private void setHoverClass(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60ab9c4f88c9de712fc9a40641fa3d2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60ab9c4f88c9de712fc9a40641fa3d2e");
            return;
        }
        initTouchListener();
        this.mTouchDelegate.c = new View.OnTouchListener() { // from class: com.sankuai.waimai.machpro.component.MPComponent.3
            public static ChangeQuickRedirect a;
            private String d = "";

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "daad0e56f204d0e821eaf8eafc4c12c7", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "daad0e56f204d0e821eaf8eafc4c12c7")).booleanValue();
                }
                if (motionEvent.getAction() == 0) {
                    this.d = MPComponent.this.mLastCssClass;
                    MPComponent mPComponent = MPComponent.this;
                    mPComponent.updateClass(MPComponent.this.mLastCssClass + StringUtil.SPACE + str);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    MPComponent.this.updateClass(this.d);
                    this.d = "";
                }
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateClass(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d287bfe7d0ec3a50b7b16f99f107098e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d287bfe7d0ec3a50b7b16f99f107098e");
            return;
        }
        if (this.mLastCssClass != null && !TextUtils.equals(str, this.mLastCssClass)) {
            if (this.mMachContext.getOpenCssReset() == -1) {
                this.mMachContext.setOpenCssReset(g.a(this.mMachContext.getBundleName()));
            }
            if (this.mMachContext.isOpenCssReset()) {
                diffCssClass(str, this.mLastCssClass);
            }
        }
        updateCssClass(str);
        com.sankuai.waimai.machpro.animator.b bVar = this.mpAnimatorManager;
        int hashCode = this.mYogaNode.hashCode();
        Object[] objArr2 = {Integer.valueOf(hashCode)};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.animator.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "9eac02ad214ff3e36bc3e8e089b02dd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "9eac02ad214ff3e36bc3e8e089b02dd5");
        } else {
            com.sankuai.waimai.machpro.animator.d dVar = bVar.b.get(hashCode);
            if (dVar != null && !bVar.e.contains(Integer.valueOf(hashCode))) {
                dVar.b();
                bVar.b.remove(hashCode);
            }
        }
        this.mLastCssClass = str;
    }

    public void addHitSlop(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cba0336a776b9628938732b52b185fd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cba0336a776b9628938732b52b185fd6");
        } else if (view == null || !(this.mView instanceof ViewGroup)) {
        } else {
            if (this.mHitslopDetegate == null) {
                this.mHitslopDetegate = new com.sankuai.waimai.machpro.view.b((ViewGroup) this.mView);
            }
            this.mHitslopDetegate.a(view, i, i2, i3, i4);
        }
    }

    public Map<String, Object> getDataAttributes() {
        return this.mDataAttributes;
    }

    public Object getDataAttribute(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03d8e41c67ad335c89db69abd400a9ca", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03d8e41c67ad335c89db69abd400a9ca");
        }
        if (this.mDataAttributes == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mDataAttributes.get(str);
    }

    private void updateContentDescription() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38b7c4856babbc90e43d47208798a9ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38b7c4856babbc90e43d47208798a9ad");
        } else if (this.mDescriptionMap != null) {
            String str = "";
            String str2 = this.mDescriptionMap.get(1);
            if (!TextUtils.isEmpty(str2)) {
                str = "" + str2;
            }
            String str3 = this.mDescriptionMap.get(2);
            if (!TextUtils.isEmpty(str3)) {
                str = (str + CommonConstant.Symbol.COMMA) + str3;
            }
            this.mView.setContentDescription(str);
        }
    }

    private void diffCssClass(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac81226deb6b142b425106003ef028d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac81226deb6b142b425106003ef028d3");
        } else if (!TextUtils.isEmpty(str2) && !str2.equals(str)) {
            Map<String, Object> cssPropertyMapByClass = getCssPropertyMapByClass(str2);
            Map<String, Object> cssPropertyMapByClass2 = getCssPropertyMapByClass(str);
            for (String str3 : cssPropertyMapByClass.keySet()) {
                if (!cssPropertyMapByClass2.containsKey(str3) && !this.mStyleProperty.containsKey(str3)) {
                    try {
                        resetCssProperty(str3);
                    } catch (Exception e) {
                        com.sankuai.waimai.machpro.util.a.a(e.getMessage() + " | PropertyName：" + str3);
                    }
                }
            }
        }
    }

    public void resetCssProperty(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e45f7e3ea66db8f6e001d9cd5b39cff7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e45f7e3ea66db8f6e001d9cd5b39cff7");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (com.sankuai.waimai.machpro.util.d.a(str)) {
                com.sankuai.waimai.machpro.util.d.a(this.mYogaNode, str);
                requestLayout();
                return;
            }
            Object[] objArr2 = {this, str};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.util.c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "5a4b95318ad3fe69863c6e6357056c56", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "5a4b95318ad3fe69863c6e6357056c56");
            } else if (TextUtils.isEmpty(str)) {
            } else {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1820411228:
                        if (str.equals(BorderBottomRightRadius.NAME)) {
                            c = 7;
                            break;
                        }
                        break;
                    case -1779213470:
                        if (str.equals("box-shadow")) {
                            c = 31;
                            break;
                        }
                        break;
                    case -1383304148:
                        if (str.equals("border")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -1332194002:
                        if (str.equals("background")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1267206133:
                        if (str.equals("opacity")) {
                            c = 28;
                            break;
                        }
                        break;
                    case -1032412580:
                        if (str.equals(BorderTopRightRadius.NAME)) {
                            c = 6;
                            break;
                        }
                        break;
                    case -585734562:
                        if (str.equals(BorderLeftColor.NAME)) {
                            c = 14;
                            break;
                        }
                        break;
                    case -570796884:
                        if (str.equals("border-left-style")) {
                            c = 15;
                            break;
                        }
                        break;
                    case -567450431:
                        if (str.equals(BorderLeftWidth.NAME)) {
                            c = '\r';
                            break;
                        }
                        break;
                    case 143851658:
                        if (str.equals(BorderTopColor.NAME)) {
                            c = 22;
                            break;
                        }
                        break;
                    case 158789336:
                        if (str.equals("border-top-style")) {
                            c = 23;
                            break;
                        }
                        break;
                    case 162135789:
                        if (str.equals("border-top-width")) {
                            c = 21;
                            break;
                        }
                        break;
                    case 292087426:
                        if (str.equals(BorderColor.NAME)) {
                            c = 11;
                            break;
                        }
                        break;
                    case 305756475:
                        if (str.equals("border-right")) {
                            c = 16;
                            break;
                        }
                        break;
                    case 307025104:
                        if (str.equals(BorderStyle.NAME)) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 310371557:
                        if (str.equals(BorderWidth.NAME)) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 419144785:
                        if (str.equals(BorderRightColor.NAME)) {
                            c = 18;
                            break;
                        }
                        break;
                    case 434082463:
                        if (str.equals("border-right-style")) {
                            c = 19;
                            break;
                        }
                        break;
                    case 436389612:
                        if (str.equals("border-bottom")) {
                            c = 24;
                            break;
                        }
                        break;
                    case 437428916:
                        if (str.equals(BorderRightWidth.NAME)) {
                            c = 17;
                            break;
                        }
                        break;
                    case 605322756:
                        if (str.equals(BackgroundColor.NAME)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 609634231:
                        if (str.equals(BorderBottomLeftRadius.NAME)) {
                            c = 5;
                            break;
                        }
                        break;
                    case 610793468:
                        if (str.equals("background-image")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 702417160:
                        if (str.equals("border-left")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 881039699:
                        if (str.equals(BorderRadius.NAME)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 956705090:
                        if (str.equals(BorderBottomColor.NAME)) {
                            c = 26;
                            break;
                        }
                        break;
                    case 971642768:
                        if (str.equals("border-bottom-style")) {
                            c = 27;
                            break;
                        }
                        break;
                    case 974989221:
                        if (str.equals(BorderBottomWidth.NAME)) {
                            c = 25;
                            break;
                        }
                        break;
                    case 1052666732:
                        if (str.equals("transform")) {
                            c = Constants.SPACE;
                            break;
                        }
                        break;
                    case 1352416423:
                        if (str.equals("transform-origin")) {
                            c = '!';
                            break;
                        }
                        break;
                    case 1466337535:
                        if (str.equals(BorderTopLeftRadius.NAME)) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1671764162:
                        if (str.equals("display")) {
                            c = 30;
                            break;
                        }
                        break;
                    case 1823781940:
                        if (str.equals("border-top")) {
                            c = 20;
                            break;
                        }
                        break;
                    case 1941332754:
                        if (str.equals(RemoteMessageConst.Notification.VISIBILITY)) {
                            c = 29;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                        getBackgroundDrawable().a((com.sankuai.waimai.machpro.view.decoration.c) null);
                        getBackgroundDrawable().a(0);
                        return;
                    case 3:
                        Arrays.fill(getBorderRadii(), 0.0f);
                        getBackgroundDrawable().e(0.0f);
                        return;
                    case 4:
                        float[] borderRadii = getBorderRadii();
                        getBorderRadii()[1] = 0.0f;
                        borderRadii[0] = 0.0f;
                        getBackgroundDrawable().a(0.0f);
                        return;
                    case 5:
                        float[] borderRadii2 = getBorderRadii();
                        getBorderRadii()[7] = 0.0f;
                        borderRadii2[6] = 0.0f;
                        getBackgroundDrawable().b(0.0f);
                        return;
                    case 6:
                        float[] borderRadii3 = getBorderRadii();
                        getBorderRadii()[3] = 0.0f;
                        borderRadii3[2] = 0.0f;
                        getBackgroundDrawable().c(0.0f);
                        return;
                    case 7:
                        float[] borderRadii4 = getBorderRadii();
                        getBorderRadii()[5] = 0.0f;
                        borderRadii4[4] = 0.0f;
                        getBackgroundDrawable().d(0.0f);
                        return;
                    case '\b':
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        Object[] objArr3 = {this};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.machpro.util.c.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "872996616eb2b7da1379b20687eba885", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "872996616eb2b7da1379b20687eba885");
                            return;
                        }
                        getBackgroundDrawable().a();
                        getYogaNode().e(YogaEdge.ALL, 0.0f);
                        requestLayout();
                        getView().invalidate();
                        return;
                    case 28:
                        getView().setAlpha(1.0f);
                        return;
                    case 29:
                        getView().setVisibility(0);
                        return;
                    case 30:
                        getView().setVisibility(0);
                        getYogaNode().a(YogaDisplay.FLEX);
                        requestLayout();
                        return;
                    case 31:
                        resetBoxShadow();
                        getView().invalidate();
                        return;
                    case ' ':
                        T view = getView();
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.machpro.animator.b.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "f712199a667c2003ccb5b5692ea2754b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "f712199a667c2003ccb5b5692ea2754b");
                            return;
                        }
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                        view.setRotationX(0.0f);
                        view.setRotationY(0.0f);
                        view.setRotation(0.0f);
                        view.setTranslationX(0.0f);
                        view.setTranslationY(0.0f);
                        return;
                    case '!':
                        com.sankuai.waimai.machpro.util.b.a((View) getView());
                        return;
                    default:
                        return;
                }
            }
        }
    }

    private Map<String, Object> getCssPropertyMapByClass(String str) {
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8095842bc8d057cb769e56acbb719710", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8095842bc8d057cb769e56acbb719710");
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        String[] split = str.split(StringUtil.SPACE);
        int length = split.length;
        if (length >= 2) {
            int i2 = length - 1;
            if (split[i2].startsWith("svelte-")) {
                while (i < i2) {
                    Object obj = this.mMachContext.getBundle().b.get(split[i] + StringUtil.SPACE + split[i2]);
                    if (obj instanceof Map) {
                        hashMap.putAll((Map) obj);
                    }
                    i++;
                }
                return hashMap;
            }
        }
        int length2 = split.length;
        while (i < length2) {
            Object obj2 = this.mMachContext.getBundle().b.get(split[i]);
            if (obj2 instanceof Map) {
                hashMap.putAll((Map) obj2);
            }
            i++;
        }
        return hashMap;
    }

    private void updateCssClass(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bbe6ce8418f8cd2383ddb86d14a0a9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bbe6ce8418f8cd2383ddb86d14a0a9f");
        } else if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(StringUtil.SPACE);
            int length = split.length;
            int i = length - 1;
            handleTransitionInfo(split[i]);
            if (length < 2 || !split[i].startsWith("svelte-")) {
                for (String str2 : split) {
                    Object obj = this.mMachContext.getBundle().b.get(str2);
                    if (obj instanceof Map) {
                        Map<String, Object> map = (Map) obj;
                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                            if (entry != null && entry.getValue() != null) {
                                updateStyle(entry.getKey(), entry.getValue(), false);
                            }
                        }
                        if (map.containsKey("animation-name")) {
                            this.mpAnimatorManager.a(this.mYogaNode, map, this.mMachContext.getBundle().b);
                        }
                    }
                }
                return;
            }
            for (int i2 = 0; i2 < i; i2++) {
                Object obj2 = this.mMachContext.getBundle().b.get(split[i2] + StringUtil.SPACE + split[i]);
                if (obj2 instanceof Map) {
                    Map<String, Object> map2 = (Map) obj2;
                    for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                        if (entry2 != null && entry2.getValue() != null) {
                            updateStyle(entry2.getKey(), entry2.getValue(), false);
                        }
                    }
                    if (map2.containsKey("animation-name")) {
                        this.mpAnimatorManager.a(this.mYogaNode, map2, this.mMachContext.getBundle().b);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void updateViewStyle(String str, Object obj) {
        char c;
        boolean z;
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ed2747230e8c8e1635dc7f7b4d61e86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ed2747230e8c8e1635dc7f7b4d61e86");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            switch (str.hashCode()) {
                case -1820411228:
                    if (str.equals(BorderBottomRightRadius.NAME)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1779213470:
                    if (str.equals("box-shadow")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case -1383304148:
                    if (str.equals("border")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1332194002:
                    if (str.equals("background")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1267206133:
                    if (str.equals("opacity")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case -1032412580:
                    if (str.equals(BorderTopRightRadius.NAME)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -585734562:
                    if (str.equals(BorderLeftColor.NAME)) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -570796884:
                    if (str.equals("border-left-style")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -567450431:
                    if (str.equals(BorderLeftWidth.NAME)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 143851658:
                    if (str.equals(BorderTopColor.NAME)) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 158789336:
                    if (str.equals("border-top-style")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 162135789:
                    if (str.equals("border-top-width")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 207960636:
                    if (str.equals("perspective")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 292087426:
                    if (str.equals(BorderColor.NAME)) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 305756475:
                    if (str.equals("border-right")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 307025104:
                    if (str.equals(BorderStyle.NAME)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 310371557:
                    if (str.equals(BorderWidth.NAME)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 419144785:
                    if (str.equals(BorderRightColor.NAME)) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 434082463:
                    if (str.equals("border-right-style")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 436389612:
                    if (str.equals("border-bottom")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 437428916:
                    if (str.equals(BorderRightWidth.NAME)) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 605322756:
                    if (str.equals(BackgroundColor.NAME)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 609634231:
                    if (str.equals(BorderBottomLeftRadius.NAME)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 610793468:
                    if (str.equals("background-image")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 702417160:
                    if (str.equals("border-left")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 881039699:
                    if (str.equals(BorderRadius.NAME)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 956705090:
                    if (str.equals(BorderBottomColor.NAME)) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 971642768:
                    if (str.equals("border-bottom-style")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 974989221:
                    if (str.equals(BorderBottomWidth.NAME)) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 1052666732:
                    if (str.equals("transform")) {
                        c = Constants.SPACE;
                        break;
                    }
                    c = 65535;
                    break;
                case 1352416423:
                    if (str.equals("transform-origin")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case 1466337535:
                    if (str.equals(BorderTopLeftRadius.NAME)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1671764162:
                    if (str.equals("display")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case 1823781940:
                    if (str.equals("border-top")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 1941332754:
                    if (str.equals(RemoteMessageConst.Notification.VISIBILITY)) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    String a = com.sankuai.waimai.machpro.util.b.a(obj, "");
                    if (!TextUtils.isEmpty(a)) {
                        if (a.contains("linear-gradient")) {
                            getBackgroundDrawable().a(com.sankuai.waimai.machpro.view.decoration.c.a(a));
                            return;
                        }
                        if (this.mpAnimatorManager != null) {
                            com.sankuai.waimai.machpro.animator.b bVar = this.mpAnimatorManager;
                            int hashCode = this.mYogaNode.hashCode();
                            Object[] objArr2 = {Integer.valueOf(hashCode)};
                            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.animator.b.a;
                            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "d8daf64a4060aa8a123ec7cff44ecc3a", RobustBitConfig.DEFAULT_VALUE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "d8daf64a4060aa8a123ec7cff44ecc3a")).booleanValue();
                            } else {
                                z = (bVar.b.get(hashCode) != null) || (bVar.c.get(hashCode) != null) || (bVar.d.get(hashCode) != null);
                            }
                            if (z) {
                                this.mView.setBackgroundColor(com.sankuai.waimai.machpro.util.b.a(a, 0));
                            }
                        }
                        getBackgroundDrawable().a(com.sankuai.waimai.machpro.util.b.a(a, 0));
                        return;
                    }
                    getBackgroundDrawable().a(0);
                    return;
                case 2:
                    String a2 = com.sankuai.waimai.machpro.util.b.a(obj, "");
                    if (TextUtils.isEmpty(a2) || !a2.contains("linear-gradient")) {
                        return;
                    }
                    getBackgroundDrawable().a(com.sankuai.waimai.machpro.view.decoration.c.a(a2));
                    return;
                case 3:
                    float a3 = com.sankuai.waimai.machpro.util.b.a(obj);
                    Arrays.fill(this.mBorderRadii, a3);
                    getBackgroundDrawable().e(a3);
                    return;
                case 4:
                    float a4 = com.sankuai.waimai.machpro.util.b.a(obj);
                    float[] fArr = this.mBorderRadii;
                    this.mBorderRadii[1] = a4;
                    fArr[0] = a4;
                    getBackgroundDrawable().a(a4);
                    return;
                case 5:
                    float a5 = com.sankuai.waimai.machpro.util.b.a(obj);
                    float[] fArr2 = this.mBorderRadii;
                    this.mBorderRadii[7] = a5;
                    fArr2[6] = a5;
                    getBackgroundDrawable().b(a5);
                    return;
                case 6:
                    float a6 = com.sankuai.waimai.machpro.util.b.a(obj);
                    float[] fArr3 = this.mBorderRadii;
                    this.mBorderRadii[3] = a6;
                    fArr3[2] = a6;
                    getBackgroundDrawable().c(a6);
                    return;
                case 7:
                    float a7 = com.sankuai.waimai.machpro.util.b.a(obj);
                    float[] fArr4 = this.mBorderRadii;
                    this.mBorderRadii[5] = a7;
                    fArr4[4] = a7;
                    getBackgroundDrawable().d(a7);
                    return;
                case '\b':
                    setBorder(0, obj);
                    return;
                case '\t':
                    setBorderWidth(0, obj);
                    return;
                case '\n':
                    setBorderStyle(0, obj);
                    return;
                case 11:
                    setBorderColor(0, obj);
                    return;
                case '\f':
                    setBorder(1, obj);
                    return;
                case '\r':
                    setBorderWidth(1, obj);
                    return;
                case 14:
                    setBorderColor(1, obj);
                    return;
                case 15:
                    setBorderStyle(1, obj);
                    return;
                case 16:
                    setBorder(2, obj);
                    return;
                case 17:
                    setBorderWidth(2, obj);
                    return;
                case 18:
                    setBorderColor(2, obj);
                    return;
                case 19:
                    setBorderStyle(2, obj);
                    return;
                case 20:
                    setBorder(3, obj);
                    return;
                case 21:
                    setBorderWidth(3, obj);
                    return;
                case 22:
                    setBorderColor(3, obj);
                    return;
                case 23:
                    setBorderStyle(3, obj);
                    return;
                case 24:
                    setBorder(4, obj);
                    return;
                case 25:
                    setBorderWidth(4, obj);
                    return;
                case 26:
                    setBorderColor(4, obj);
                    return;
                case 27:
                    setBorderStyle(4, obj);
                    return;
                case 28:
                    this.mView.setAlpha(com.sankuai.waimai.machpro.util.b.b(obj));
                    return;
                case 29:
                    if ("hidden".equals(obj)) {
                        this.mView.setVisibility(4);
                        return;
                    } else {
                        this.mView.setVisibility(0);
                        return;
                    }
                case 30:
                    if ("none".equals(obj)) {
                        this.mView.setVisibility(8);
                        this.mYogaNode.a(YogaDisplay.NONE);
                    } else {
                        this.mView.setVisibility(0);
                        this.mYogaNode.a(YogaDisplay.FLEX);
                    }
                    requestLayout();
                    return;
                case 31:
                    this.mBoxShadow = com.sankuai.waimai.machpro.util.b.a(obj, "");
                    this.mView.invalidate();
                    return;
                case ' ':
                    Map<String, Float> a8 = com.sankuai.waimai.machpro.animator.c.a((Object) com.sankuai.waimai.machpro.util.b.a(obj, ""), false);
                    com.sankuai.waimai.machpro.animator.b bVar2 = this.mpAnimatorManager;
                    T t = this.mView;
                    Object[] objArr3 = {t, a8};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.machpro.animator.b.a;
                    if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect4, false, "cba65c3d4afa117977a17ddf55ec2318", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect4, false, "cba65c3d4afa117977a17ddf55ec2318");
                        return;
                    } else if (a8 != null) {
                        Float f = a8.get(RecceAnimUtils.SCALE_X);
                        Float f2 = a8.get(RecceAnimUtils.SCALE_Y);
                        Float f3 = a8.get(RecceAnimUtils.TRANSLATION_X);
                        Float f4 = a8.get(RecceAnimUtils.TRANSLATION_Y);
                        Float f5 = a8.get(RecceAnimUtils.ROTATION_X);
                        Float f6 = a8.get(RecceAnimUtils.ROTATION_Y);
                        Float f7 = a8.get("rotationZ");
                        Float f8 = a8.get(RecceAnimUtils.ROTATION);
                        if (f != null) {
                            t.setScaleX(f.floatValue());
                        }
                        if (f2 != null) {
                            t.setScaleY(f2.floatValue());
                        }
                        if (f5 != null) {
                            t.setRotationX(f5.floatValue());
                        }
                        if (f6 != null) {
                            t.setRotationY(f6.floatValue());
                        }
                        if (f7 != null || f8 != null) {
                            if (f7 != null) {
                                f8 = f7;
                            }
                            t.setRotation(f8.floatValue());
                        }
                        if (f3 != null) {
                            t.setTranslationX(f3.floatValue());
                        }
                        if (f4 != null) {
                            t.setTranslationY(f4.floatValue());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                case '!':
                    this.mView.setCameraDistance(com.sankuai.waimai.machpro.util.b.b(obj) * com.sankuai.waimai.machpro.util.b.a() * 16.0f);
                    return;
                case '\"':
                    com.sankuai.waimai.machpro.util.b.a(this.mView, com.sankuai.waimai.machpro.animator.c.d(com.sankuai.waimai.machpro.util.b.a(obj, "")));
                    return;
                default:
                    return;
            }
        }
    }

    private void setBorder(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f66fd407d1ecdc0b7a706eb5b21d887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f66fd407d1ecdc0b7a706eb5b21d887");
            return;
        }
        String a = com.sankuai.waimai.machpro.util.b.a(obj, "");
        if ("none".equals(a)) {
            getBackgroundDrawable().a();
            if (i == 0) {
                this.mYogaNode.e(YogaEdge.ALL, 0.0f);
            } else if (i == 1) {
                this.mYogaNode.e(YogaEdge.LEFT, 0.0f);
            } else if (i == 2) {
                this.mYogaNode.e(YogaEdge.RIGHT, 0.0f);
            } else if (i == 3) {
                this.mYogaNode.e(YogaEdge.TOP, 0.0f);
            } else if (i == 4) {
                this.mYogaNode.e(YogaEdge.BOTTOM, 0.0f);
            }
            this.mView.invalidate();
            requestLayout();
        } else if (TextUtils.isEmpty(a)) {
        } else {
            String[] split = a.split("\\s+");
            if (split.length == 3) {
                com.sankuai.waimai.machpro.view.decoration.a border = getBorder();
                border.a(com.sankuai.waimai.machpro.util.b.a((Object) split[0]));
                border.b(com.sankuai.waimai.machpro.util.b.d(split[1]));
                border.a(com.sankuai.waimai.machpro.util.b.a(split[2], 0));
                border.c(i);
                if (i == 0) {
                    this.mYogaNode.e(YogaEdge.ALL, border.b);
                } else if (i == 1) {
                    this.mYogaNode.e(YogaEdge.LEFT, border.b);
                } else if (i == 2) {
                    this.mYogaNode.e(YogaEdge.RIGHT, border.b);
                } else if (i == 3) {
                    this.mYogaNode.e(YogaEdge.TOP, border.b);
                } else if (i == 4) {
                    this.mYogaNode.e(YogaEdge.BOTTOM, border.b);
                }
                requestLayout();
            }
        }
    }

    private void setBorderWidth(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df474b4d3dbb1b30f9fb5d77cb904acd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df474b4d3dbb1b30f9fb5d77cb904acd");
            return;
        }
        float a = com.sankuai.waimai.machpro.util.b.a(obj);
        getBorder().a(a);
        getBorder().c(i);
        if (i == 0) {
            this.mYogaNode.e(YogaEdge.ALL, a);
        } else if (i == 1) {
            this.mYogaNode.e(YogaEdge.LEFT, a);
        } else if (i == 2) {
            this.mYogaNode.e(YogaEdge.RIGHT, a);
        } else if (i == 3) {
            this.mYogaNode.e(YogaEdge.TOP, a);
        } else if (i == 4) {
            this.mYogaNode.e(YogaEdge.BOTTOM, a);
        }
        requestLayout();
    }

    private void setBorderColor(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac7ad5dcd08cb70efadd9056259f9e61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac7ad5dcd08cb70efadd9056259f9e61");
            return;
        }
        getBorder().a(com.sankuai.waimai.machpro.util.b.a(com.sankuai.waimai.machpro.util.b.a(obj, ""), 0));
        getBorder().c(i);
        this.mView.invalidate();
    }

    private void setBorderStyle(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de8e2245921ac4302ae8420ee9f1ac20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de8e2245921ac4302ae8420ee9f1ac20");
            return;
        }
        getBorder().b(com.sankuai.waimai.machpro.util.b.d(com.sankuai.waimai.machpro.util.b.a(obj, "")));
        getBorder().c(i);
        this.mView.invalidate();
    }

    public String getBoxShadow() {
        return this.mBoxShadow;
    }

    public void resetBoxShadow() {
        this.mBoxShadow = "";
    }

    public float[] getBorderRadii() {
        return this.mBorderRadii;
    }

    public void onFrameChanged(final int i, final int i2, final int i3, final int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e5c1b8eeb40de87c1e5d6ba03d19cdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e5c1b8eeb40de87c1e5d6ba03d19cdc");
        } else if (this.isListenerLayoutChange) {
            com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.machpro.component.MPComponent.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a2dae5d7506e68f109deb9844b046324", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a2dae5d7506e68f109deb9844b046324");
                        return;
                    }
                    MachMap machMap = new MachMap();
                    machMap.put(Constants.GestureMoveEvent.KEY_X, Float.valueOf(com.sankuai.waimai.machpro.util.b.a(MPComponent.this.mMachContext.getContext(), i)));
                    machMap.put(Constants.GestureMoveEvent.KEY_Y, Float.valueOf(com.sankuai.waimai.machpro.util.b.a(MPComponent.this.mMachContext.getContext(), i2)));
                    machMap.put("width", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(MPComponent.this.mMachContext.getContext(), i3)));
                    machMap.put("height", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(MPComponent.this.mMachContext.getContext(), i4)));
                    MachArray machArray = new MachArray();
                    machArray.add(machMap);
                    MPComponent.this.dispatchEvent("layout", machArray);
                }
            });
        }
    }

    private MachMap getViewLayoutInfo() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de0c73a17e355ab61f0e091506fbbea3", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de0c73a17e355ab61f0e091506fbbea3");
        }
        if (this.mView != null) {
            i4 = this.mView.getLeft();
            i = this.mView.getTop();
            i2 = this.mView.getWidth();
            i3 = this.mView.getHeight();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        MachMap machMap = new MachMap();
        machMap.put(Constants.GestureMoveEvent.KEY_X, Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.mMachContext.getContext(), i4)));
        machMap.put(Constants.GestureMoveEvent.KEY_Y, Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.mMachContext.getContext(), i)));
        machMap.put("width", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.mMachContext.getContext(), i2)));
        machMap.put("height", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.mMachContext.getContext(), i3)));
        return machMap;
    }

    private MachMap getViewLayoutInScreen() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "839f95831e748097d8d767540e8a5367", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "839f95831e748097d8d767540e8a5367");
        }
        if (this.mView != null) {
            int[] iArr = new int[2];
            this.mView.getLocationOnScreen(iArr);
            i4 = iArr[0];
            i = iArr[1];
            i2 = this.mView.getWidth();
            i3 = this.mView.getHeight();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        MachMap machMap = new MachMap();
        machMap.put(Constants.GestureMoveEvent.KEY_X, Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.mMachContext.getContext(), i4)));
        machMap.put(Constants.GestureMoveEvent.KEY_Y, Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.mMachContext.getContext(), i)));
        machMap.put("width", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.mMachContext.getContext(), i2)));
        machMap.put("height", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.mMachContext.getContext(), i3)));
        return machMap;
    }

    private MachMap measureInView(MPComponent mPComponent) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View view;
        int i6 = 0;
        Object[] objArr = {mPComponent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2ed5f0dbdceeb9aa70f2985a2e63cd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2ed5f0dbdceeb9aa70f2985a2e63cd3");
        }
        if (mPComponent == null || (view = mPComponent.getView()) == null) {
            i = 0;
            i2 = 0;
        } else {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            i = iArr[0];
            i2 = iArr[1];
        }
        if (this.mView != null) {
            int[] iArr2 = new int[2];
            this.mView.getLocationOnScreen(iArr2);
            i6 = iArr2[0];
            i3 = iArr2[1];
            i4 = this.mView.getWidth();
            i5 = this.mView.getHeight();
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        MachMap machMap = new MachMap();
        machMap.put(Constants.GestureMoveEvent.KEY_X, Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.mMachContext.getContext(), i6 - i)));
        machMap.put(Constants.GestureMoveEvent.KEY_Y, Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.mMachContext.getContext(), i3 - i2)));
        machMap.put("width", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.mMachContext.getContext(), i4)));
        machMap.put("height", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.mMachContext.getContext(), i5)));
        return machMap;
    }

    public com.sankuai.waimai.machpro.view.decoration.b getBackgroundDrawable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5504f54e7d969dd9d0f8b75a82a9015c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.machpro.view.decoration.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5504f54e7d969dd9d0f8b75a82a9015c");
        }
        if (this.mBackgroundDrawable == null) {
            this.mBackgroundDrawable = new com.sankuai.waimai.machpro.view.decoration.b();
            this.mView.setBackground(this.mBackgroundDrawable);
        }
        return this.mBackgroundDrawable;
    }

    private com.sankuai.waimai.machpro.view.decoration.a getBorder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27bd8f12adf387c3fdcf9070ca5dc052", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.machpro.view.decoration.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27bd8f12adf387c3fdcf9070ca5dc052");
        }
        com.sankuai.waimai.machpro.view.decoration.b backgroundDrawable = getBackgroundDrawable();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.view.decoration.b.a;
        if (PatchProxy.isSupport(objArr2, backgroundDrawable, changeQuickRedirect3, false, "f25d461a2c9c92a4f78a718e2ca247fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.machpro.view.decoration.a) PatchProxy.accessDispatch(objArr2, backgroundDrawable, changeQuickRedirect3, false, "f25d461a2c9c92a4f78a718e2ca247fe");
        }
        if (backgroundDrawable.b == null) {
            backgroundDrawable.b = new com.sankuai.waimai.machpro.view.decoration.a(backgroundDrawable);
        }
        backgroundDrawable.b();
        return backgroundDrawable.b;
    }

    public void updateStyle(String str, Object obj, boolean z) {
        Object[] objArr = {str, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a0e8743608b8f7861a990f29c42a514", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a0e8743608b8f7861a990f29c42a514");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                this.mStyleProperty.put(str, obj);
            } else if (this.mStyleProperty.containsKey(str)) {
                return;
            }
        }
        if (this.needTransitionAttrs != null && this.needTransitionAttrs.contains(str)) {
            if (this.tmpStyleTransition == null) {
                this.tmpStyleTransition = new HashMap<>();
            }
            LinkedList<Object> linkedList = this.tmpStyleTransition.get(str);
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                linkedList.add(obj);
                this.tmpStyleTransition.put(str, linkedList);
            } else {
                linkedList.add(obj);
                if (linkedList.size() > 2) {
                    linkedList.removeFirst();
                }
            }
            if (linkedList.size() == 2) {
                return;
            }
        }
        if (com.sankuai.waimai.machpro.util.d.a(str)) {
            com.sankuai.waimai.machpro.util.d.a(this.mYogaNode, str, com.sankuai.waimai.machpro.util.b.a(obj, ""));
            requestLayout();
            return;
        }
        updateViewStyle(str, obj);
    }

    private void safeSetProperty(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af1e43e09356cc65d20249f8ce6cb257", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af1e43e09356cc65d20249f8ce6cb257");
            return;
        }
        try {
            setProperty(str, obj);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("safeSetProperty exception-->" + e.getMessage() + "\n" + Log.getStackTraceString(e));
        }
    }

    private void setProperty(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf8046efb99f453265d0a38594a138ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf8046efb99f453265d0a38594a138ec");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            String a = com.sankuai.waimai.machpro.util.b.a(obj, "");
            if (a.equals(FpsEvent.TYPE_SCROLL_AUTO) || a.equals("initial")) {
                resetCssProperty(str);
            } else {
                updateStyle(str, obj, true);
            }
        }
    }

    private void removeProperty(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03ea130da5b40efa1a6a09f129ebacdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03ea130da5b40efa1a6a09f129ebacdf");
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && this.mStyleProperty.containsKey(str)) {
                this.mStyleProperty.remove(str);
                Map<String, Object> cssPropertyMapByClass = getCssPropertyMapByClass(this.mLastCssClass);
                if (cssPropertyMapByClass.containsKey(str)) {
                    setProperty(str, cssPropertyMapByClass.get(str));
                } else {
                    resetCssProperty(str);
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("safeRemoveProperty exception-->" + e.getMessage() + "\n" + Log.getStackTraceString(e));
        }
    }

    public void setAnimation(MachMap machMap, final MPJSCallBack mPJSCallBack) {
        Object[] objArr = {machMap, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7b27e97a79e3e53de7231a261c46225", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7b27e97a79e3e53de7231a261c46225");
        } else if (machMap == null) {
            if (this.mpAnimatorManager == null || this.mpAnimatorManager.c.get(this.mYogaNode.hashCode()) == null) {
                return;
            }
            com.sankuai.waimai.machpro.animator.d dVar = this.mpAnimatorManager.c.get(this.mYogaNode.hashCode());
            if (dVar.e()) {
                dVar.d();
            }
        } else {
            try {
                Map<String, Object> javaMap = machMap.getJavaMap();
                MachMap machMap2 = (MachMap) javaMap.get("keyFrames");
                if (machMap2 == null) {
                    return;
                }
                com.sankuai.waimai.machpro.animator.b bVar = this.mpAnimatorManager;
                com.facebook.yoga.d dVar2 = this.mYogaNode;
                Map<String, Object> javaMap2 = machMap2.getJavaMap();
                Object[] objArr2 = {dVar2, javaMap, javaMap2};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.animator.b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "c9559df4e0a33dc06dd6186a4065624f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "c9559df4e0a33dc06dd6186a4065624f");
                } else {
                    try {
                        SparseArray<com.sankuai.waimai.machpro.animator.d> sparseArray = bVar.c;
                        com.sankuai.waimai.machpro.animator.d dVar3 = sparseArray.get(dVar2.hashCode());
                        if (dVar3 == null) {
                            sparseArray.put(dVar2.hashCode(), new com.sankuai.waimai.machpro.animator.f(dVar2, javaMap, javaMap2));
                        } else {
                            dVar3.c();
                            dVar3.a(dVar2, javaMap, javaMap2);
                        }
                    } catch (Exception unused) {
                        com.sankuai.waimai.machpro.util.a.a("MPAnim", "JSAnim init Error");
                    }
                }
                final com.sankuai.waimai.machpro.animator.b bVar2 = this.mpAnimatorManager;
                com.facebook.yoga.d dVar4 = this.mYogaNode;
                Object[] objArr3 = {dVar4, mPJSCallBack};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.machpro.animator.b.a;
                if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect4, false, "76976217dcb3f48c514150c06f9700d7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect4, false, "76976217dcb3f48c514150c06f9700d7");
                } else {
                    final com.sankuai.waimai.machpro.animator.d dVar5 = bVar2.c.get(dVar4.hashCode());
                    if (dVar5 != null && mPJSCallBack != null) {
                        dVar5.a(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.machpro.animator.b.1
                            public static ChangeQuickRedirect a;

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animator) {
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationRepeat(Animator animator) {
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                                Object[] objArr4 = {animator};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "e2295ffab1fb24d3ef510f3578e1b6f7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "e2295ffab1fb24d3ef510f3578e1b6f7");
                                    return;
                                }
                                MachMap machMap3 = new MachMap();
                                machMap3.put("state", "start");
                                mPJSCallBack.invoke(machMap3);
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                Object[] objArr4 = {animator};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "a33bee7d6f620508953453b21764ed81", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "a33bee7d6f620508953453b21764ed81");
                                    return;
                                }
                                MachMap machMap3 = new MachMap();
                                machMap3.put("state", "end");
                                mPJSCallBack.invoke(machMap3);
                                dVar5.c();
                            }
                        });
                    }
                }
                com.sankuai.waimai.machpro.animator.b bVar3 = this.mpAnimatorManager;
                int hashCode = this.mYogaNode.hashCode();
                Object[] objArr4 = {Integer.valueOf(hashCode)};
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.machpro.animator.b.a;
                if (PatchProxy.isSupport(objArr4, bVar3, changeQuickRedirect5, false, "06774c88e34b0037b4792ae9298c826a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar3, changeQuickRedirect5, false, "06774c88e34b0037b4792ae9298c826a");
                    return;
                }
                com.sankuai.waimai.machpro.animator.d dVar6 = bVar3.c.get(hashCode);
                if (dVar6 != null) {
                    dVar6.b();
                }
            } catch (Exception unused2) {
                com.sankuai.waimai.machpro.util.a.a("MPAnim", "Anim Attr Error");
            }
        }
    }

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd91c1c96a2fe1b591b497ec6f49f7ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd91c1c96a2fe1b591b497ec6f49f7ff");
            return;
        }
        this.released = true;
        com.sankuai.waimai.machpro.instance.a mPContext = this.mMachContext.getInstance();
        com.sankuai.waimai.machpro.bridge.c cVar = this.callback;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.instance.a.a;
        if (PatchProxy.isSupport(objArr2, mPContext, changeQuickRedirect3, false, "4d4b9bac7ec43133bbc04a516a701525", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mPContext, changeQuickRedirect3, false, "4d4b9bac7ec43133bbc04a516a701525");
        } else if (cVar != null && mPContext.m != null) {
            mPContext.m.remove(cVar);
        }
        if (this.tmpTransitionMap != null) {
            this.tmpTransitionMap.clear();
        }
        if (this.startAttr != null) {
            this.startAttr.clear();
        }
        if (this.endAttr != null) {
            this.endAttr.clear();
        }
        if (this.cssQueue != null) {
            this.cssQueue.clear();
        }
        if (this.mpAnimatorManager != null) {
            com.sankuai.waimai.machpro.animator.b bVar = this.mpAnimatorManager;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.machpro.animator.b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect4, false, "e438f2543ffad45a7031a8b7d6aca27f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect4, false, "e438f2543ffad45a7031a8b7d6aca27f");
                return;
            }
            if (bVar.b != null) {
                for (int i = 0; i < bVar.b.size(); i++) {
                    com.sankuai.waimai.machpro.animator.d dVar = bVar.b.get(i);
                    if (dVar != null) {
                        dVar.cancel();
                    }
                }
            }
            if (bVar.c != null) {
                for (int i2 = 0; i2 < bVar.c.size(); i2++) {
                    com.sankuai.waimai.machpro.animator.d dVar2 = bVar.c.get(i2);
                    if (dVar2 != null) {
                        dVar2.cancel();
                    }
                }
            }
            if (bVar.d != null) {
                for (int i3 = 0; i3 < bVar.d.size(); i3++) {
                    i iVar = bVar.d.get(i3);
                    if (iVar != null) {
                        iVar.cancel();
                    }
                }
            }
            if (bVar.e != null) {
                bVar.e.clear();
            }
        }
    }

    private void handleTransitionInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3e69664d3855e798aa1471969b77162", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3e69664d3855e798aa1471969b77162");
            return;
        }
        Object obj = this.mMachContext.getBundle().b.get(str);
        if (this.cssQueue == null) {
            this.cssQueue = new LinkedList<>();
        }
        this.cssQueue.add(obj);
        if (this.cssQueue.size() > 2) {
            this.cssQueue.removeFirst();
        } else if (this.cssQueue.size() == 2) {
            if (this.startAttr == null) {
                this.startAttr = new HashMap();
            }
            if (this.endAttr == null) {
                this.endAttr = new HashMap();
            }
            if (this.tmpTransitionMap == null) {
                this.tmpTransitionMap = new HashMap<>();
            }
            if (this.cssQueue.getFirst() instanceof Map) {
                this.startAttr.clear();
                this.startAttr.putAll((Map) this.cssQueue.getFirst());
            }
            if (this.cssQueue.getLast() instanceof Map) {
                this.endAttr.clear();
                this.endAttr.putAll((Map) this.cssQueue.getLast());
            }
            this.transitionAttrInfo = this.mpAnimatorManager.a(this.startAttr);
            if (this.transitionAttrInfo != null) {
                this.tmpTransitionMap.put(str, this.transitionAttrInfo);
            } else {
                this.transitionAttrInfo = this.tmpTransitionMap.get(str);
            }
            this.needTransitionAttrs = this.mpAnimatorManager.a(this.transitionAttrInfo, this.startAttr, this.endAttr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canTransition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24d5e7f6e9a61072bd6b2577ed863a24", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24d5e7f6e9a61072bd6b2577ed863a24")).booleanValue() : (this.needTransitionAttrs == null || this.transitionAttrInfo == null || this.cssQueue.size() <= 0) ? false : true;
    }
}
