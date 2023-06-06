package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;
import android.support.constraint.R;
import android.support.v4.os.TraceCompat;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.NestedScrollingChild2;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.ScrollingView;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.widget.ViewBoundsCheck;
import android.support.v7.widget.ab;
import android.support.v7.widget.bc;
import android.support.v7.widget.d;
import android.support.v7.widget.s;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements NestedScrollingChild2, ScrollingView {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    private static final boolean ALLOW_THREAD_GAP_WORK;
    static final boolean DEBUG = false;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator;
    RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    private j mActiveOnItemTouchListener;
    a mAdapter;
    android.support.v7.widget.d mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private d mChildDrawingOrderCallback;
    android.support.v7.widget.s mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    private int mDispatchScrollCounter;
    private int mEatRequestLayout;
    private int mEatenAccessibilityChangeFlags;
    boolean mEnableFastScroller;
    @VisibleForTesting
    boolean mFirstLayoutComplete;
    ab mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    boolean mIsAttached;
    ItemAnimator mItemAnimator;
    private ItemAnimator.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<f> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    @VisibleForTesting
    LayoutManager mLayout;
    boolean mLayoutFrozen;
    private int mLayoutOrScrollCounter;
    boolean mLayoutRequestEaten;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final o mObserver;
    private List<h> mOnChildAttachStateListeners;
    private i mOnFlingListener;
    private final ArrayList<j> mOnItemTouchListeners;
    @VisibleForTesting
    final List<s> mPendingAccessibilityImportanceChange;
    private SavedState mPendingSavedState;
    boolean mPostedAnimatorRunner;
    ab.a mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final m mRecycler;
    n mRecyclerListener;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private final int[] mScrollConsumed;
    private k mScrollListener;
    private List<k> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    protected int mScrollState;
    private NestedScrollingChildHelper mScrollingChildHelper;
    final State mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    protected final r mViewFlinger;
    private final bc.b mViewInfoProcessCallback;
    final bc mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    private static final int[] CLIP_TO_PADDING_ATTR = {16842987};

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface d {
        int a(int i, int i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface h {
        void onChildViewAttachedToWindow(View view);

        void onChildViewDetachedFromWindow(View view);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class i {
        public abstract boolean onFling(int i, int i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface j {
        boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z);

        void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class k {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface n {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class q {
        public abstract View a(m mVar, int i, int i2);
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onScrollStateChanged(int i2) {
    }

    public void onScrolled(int i2, int i3) {
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }

    static {
        FORCE_INVALIDATE_DISPLAY_LIST = Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = Build.VERSION.SDK_INT >= 23;
        POST_UPDATES_ON_ANIMATION = Build.VERSION.SDK_INT >= 16;
        ALLOW_THREAD_GAP_WORK = Build.VERSION.SDK_INT >= 21;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = Build.VERSION.SDK_INT <= 15;
        IGNORE_DETACHED_FOCUSED_CHILD = Build.VERSION.SDK_INT <= 15;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        sQuinticInterpolator = new Interpolator() { // from class: android.support.v7.widget.RecyclerView.3
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f2) {
                float f3 = f2 - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            }
        };
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mObserver = new o();
        this.mRecycler = new m();
        this.mViewInfoStore = new bc();
        this.mUpdateChildViewsRunnable = new Runnable() { // from class: android.support.v7.widget.RecyclerView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!RecyclerView.this.mFirstLayoutComplete || RecyclerView.this.isLayoutRequested()) {
                    return;
                }
                if (!RecyclerView.this.mIsAttached) {
                    RecyclerView.this.requestLayout();
                } else if (RecyclerView.this.mLayoutFrozen) {
                    RecyclerView.this.mLayoutRequestEaten = true;
                } else {
                    RecyclerView.this.consumePendingUpdateOperations();
                }
            }
        };
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mEatRequestLayout = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mItemAnimator = new v();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new r();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new ab.a() : null;
        this.mState = new State();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new e();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mNestedOffsets = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new Runnable() { // from class: android.support.v7.widget.RecyclerView.2
            @Override // java.lang.Runnable
            public final void run() {
                if (RecyclerView.this.mItemAnimator != null) {
                    RecyclerView.this.mItemAnimator.runPendingAnimations();
                }
                RecyclerView.this.mPostedAnimatorRunner = false;
            }
        };
        this.mViewInfoProcessCallback = new bc.b() { // from class: android.support.v7.widget.RecyclerView.4
            @Override // android.support.v7.widget.bc.b
            public final void a(s sVar, @NonNull ItemAnimator.c cVar, @Nullable ItemAnimator.c cVar2) {
                RecyclerView.this.mRecycler.b(sVar);
                RecyclerView.this.animateDisappearance(sVar, cVar, cVar2);
            }

            @Override // android.support.v7.widget.bc.b
            public final void b(s sVar, ItemAnimator.c cVar, ItemAnimator.c cVar2) {
                RecyclerView.this.animateAppearance(sVar, cVar, cVar2);
            }

            @Override // android.support.v7.widget.bc.b
            public final void c(s sVar, @NonNull ItemAnimator.c cVar, @NonNull ItemAnimator.c cVar2) {
                sVar.setIsRecyclable(false);
                if (RecyclerView.this.mDataSetHasChangedAfterLayout) {
                    if (RecyclerView.this.mItemAnimator.animateChange(sVar, sVar, cVar, cVar2)) {
                        RecyclerView.this.postAnimationRunner();
                    }
                } else if (RecyclerView.this.mItemAnimator.animatePersistence(sVar, cVar, cVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            }

            @Override // android.support.v7.widget.bc.b
            public final void a(s sVar) {
                RecyclerView.this.mLayout.removeAndRecycleView(sVar.itemView, RecyclerView.this.mRecycler);
            }
        };
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CLIP_TO_PADDING_ATTR, i2, 0);
            this.mClipToPadding = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.mClipToPadding = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16842993, R.attr.layoutManager, R.attr.spanCount, R.attr.reverseLayout, R.attr.stackFromEnd, R.attr.fastScrollEnabled, R.attr.fastScrollVerticalThumbDrawable, R.attr.fastScrollVerticalTrackDrawable, R.attr.fastScrollHorizontalThumbDrawable, R.attr.fastScrollHorizontalTrackDrawable}, i2, 0);
            String string = obtainStyledAttributes2.getString(2);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.mEnableFastScroller = obtainStyledAttributes2.getBoolean(6, false);
            if (this.mEnableFastScroller) {
                initFastScroller((StateListDrawable) obtainStyledAttributes2.getDrawable(7), obtainStyledAttributes2.getDrawable(8), (StateListDrawable) obtainStyledAttributes2.getDrawable(9), obtainStyledAttributes2.getDrawable(10));
            }
            obtainStyledAttributes2.recycle();
            createLayoutManager(context, string, attributeSet, i2, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i2, 0);
                boolean z2 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z = z2;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    String exceptionLabel() {
        return StringUtil.SPACE + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void setAccessibilityDelegateCompat(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.mAccessibilityDelegate = recyclerViewAccessibilityDelegate;
        ViewCompat.setAccessibilityDelegate(this, this.mAccessibilityDelegate);
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        ClassLoader classLoader;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> asSubclass = classLoader.loadClass(fullClassName).asSubclass(LayoutManager.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((LayoutManager) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e8);
            }
        }
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(CommonConstant.Symbol.DOT)) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + CommonConstant.Symbol.DOT_CHAR + str;
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new android.support.v7.widget.s(new s.b() { // from class: android.support.v7.widget.RecyclerView.5
            @Override // android.support.v7.widget.s.b
            public final int a() {
                return RecyclerView.this.getChildCount();
            }

            @Override // android.support.v7.widget.s.b
            public final void a(View view, int i2) {
                RecyclerView.this.addView(view, i2);
                RecyclerView.this.dispatchChildAttached(view);
            }

            @Override // android.support.v7.widget.s.b
            public final int a(View view) {
                return RecyclerView.this.indexOfChild(view);
            }

            @Override // android.support.v7.widget.s.b
            public final void a(int i2) {
                View childAt = RecyclerView.this.getChildAt(i2);
                if (childAt != null) {
                    RecyclerView.this.dispatchChildDetached(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeViewAt(i2);
            }

            @Override // android.support.v7.widget.s.b
            public final View b(int i2) {
                return RecyclerView.this.getChildAt(i2);
            }

            @Override // android.support.v7.widget.s.b
            public final s b(View view) {
                return RecyclerView.getChildViewHolderInt(view);
            }

            @Override // android.support.v7.widget.s.b
            public final void a(View view, int i2, ViewGroup.LayoutParams layoutParams) {
                s childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                    }
                    childViewHolderInt.clearTmpDetachFlag();
                }
                RecyclerView.this.attachViewToParent(view, i2, layoutParams);
            }

            @Override // android.support.v7.widget.s.b
            public final void c(int i2) {
                s childViewHolderInt;
                View b2 = b(i2);
                if (b2 != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(b2)) != null) {
                    if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                    }
                    childViewHolderInt.addFlags(256);
                }
                RecyclerView.this.detachViewFromParent(i2);
            }

            @Override // android.support.v7.widget.s.b
            public final void c(View view) {
                s childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
                }
            }

            @Override // android.support.v7.widget.s.b
            public final void d(View view) {
                s childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onLeftHiddenState(RecyclerView.this);
                }
            }

            @Override // android.support.v7.widget.s.b
            public final void b() {
                int childCount = RecyclerView.this.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View b2 = b(i2);
                    RecyclerView.this.dispatchChildDetached(b2);
                    b2.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }
        });
    }

    void initAdapterManager() {
        this.mAdapterHelper = new android.support.v7.widget.d(new d.a() { // from class: android.support.v7.widget.RecyclerView.6
            @Override // android.support.v7.widget.d.a
            public final s a(int i2) {
                s findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i2, true);
                if (findViewHolderForPosition == null || RecyclerView.this.mChildHelper.d(findViewHolderForPosition.itemView)) {
                    return null;
                }
                return findViewHolderForPosition;
            }

            @Override // android.support.v7.widget.d.a
            public final void a(int i2, int i3) {
                RecyclerView.this.offsetPositionRecordsForRemove(i2, i3, true);
                RecyclerView.this.mItemsAddedOrRemoved = true;
                RecyclerView.this.mState.c += i3;
            }

            @Override // android.support.v7.widget.d.a
            public final void b(int i2, int i3) {
                RecyclerView.this.offsetPositionRecordsForRemove(i2, i3, false);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            @Override // android.support.v7.widget.d.a
            public final void a(int i2, int i3, Object obj) {
                RecyclerView.this.viewRangeUpdate(i2, i3, obj);
                RecyclerView.this.mItemsChanged = true;
            }

            @Override // android.support.v7.widget.d.a
            public final void a(d.b bVar) {
                c(bVar);
            }

            private void c(d.b bVar) {
                int i2 = bVar.a;
                if (i2 == 4) {
                    RecyclerView.this.mLayout.onItemsUpdated(RecyclerView.this, bVar.b, bVar.d, bVar.c);
                } else if (i2 != 8) {
                    switch (i2) {
                        case 1:
                            RecyclerView.this.mLayout.onItemsAdded(RecyclerView.this, bVar.b, bVar.d);
                            return;
                        case 2:
                            RecyclerView.this.mLayout.onItemsRemoved(RecyclerView.this, bVar.b, bVar.d);
                            return;
                        default:
                            return;
                    }
                } else {
                    RecyclerView.this.mLayout.onItemsMoved(RecyclerView.this, bVar.b, bVar.d, 1);
                }
            }

            @Override // android.support.v7.widget.d.a
            public final void b(d.b bVar) {
                c(bVar);
            }

            @Override // android.support.v7.widget.d.a
            public final void c(int i2, int i3) {
                RecyclerView.this.offsetPositionRecordsForInsert(i2, i3);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            @Override // android.support.v7.widget.d.a
            public final void d(int i2, int i3) {
                RecyclerView.this.offsetPositionRecordsForMove(i2, i3);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }
        });
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i2) {
            case 0:
                break;
            case 1:
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                StringBuilder sb = new StringBuilder("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i2);
                sb.append("; using default value");
                break;
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void swapAdapter(a aVar, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(aVar, true, z);
        requestLayout();
    }

    public void setAdapter(a aVar) {
        setLayoutFrozen(false);
        setAdapterInternal(aVar, false, true);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeAndRecycleViews() {
        if (this.mItemAnimator != null) {
            this.mItemAnimator.endAnimations();
        }
        if (this.mLayout != null) {
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.a();
    }

    private void setAdapterInternal(a aVar, boolean z, boolean z2) {
        if (this.mAdapter != null) {
            this.mAdapter.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.a();
        a aVar2 = this.mAdapter;
        this.mAdapter = aVar;
        if (aVar != null) {
            aVar.registerAdapterDataObserver(this.mObserver);
            aVar.onAttachedToRecyclerView(this);
        }
        if (this.mLayout != null) {
            this.mLayout.onAdapterChanged(aVar2, this.mAdapter);
        }
        m mVar = this.mRecycler;
        a aVar3 = this.mAdapter;
        mVar.a();
        l d2 = mVar.d();
        if (aVar2 != null) {
            d2.a();
        }
        if (!z && d2.b == 0) {
            for (int i2 = 0; i2 < d2.a.size(); i2++) {
                d2.a.valueAt(i2).a.clear();
            }
        }
        if (aVar3 != null) {
            d2.a(aVar3);
        }
        this.mState.f = true;
        setDataSetChangedAfterLayout();
    }

    public a getAdapter() {
        return this.mAdapter;
    }

    public void setRecyclerListener(n nVar) {
        this.mRecyclerListener = nVar;
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.mLayout != null) {
            return this.mLayout.getBaseline();
        }
        return super.getBaseline();
    }

    public void addOnChildAttachStateChangeListener(h hVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(hVar);
    }

    public void removeOnChildAttachStateChangeListener(h hVar) {
        if (this.mOnChildAttachStateListeners == null) {
            return;
        }
        this.mOnChildAttachStateListeners.remove(hVar);
    }

    public void clearOnChildAttachStateChangeListeners() {
        if (this.mOnChildAttachStateListeners != null) {
            this.mOnChildAttachStateListeners.clear();
        }
    }

    public void setLayoutManager(LayoutManager layoutManager) {
        if (layoutManager == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            if (this.mItemAnimator != null) {
                this.mItemAnimator.endAnimations();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.a();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.a();
        }
        android.support.v7.widget.s sVar = this.mChildHelper;
        sVar.b.a();
        for (int size = sVar.c.size() - 1; size >= 0; size--) {
            sVar.a.d(sVar.c.get(size));
            sVar.c.remove(size);
        }
        sVar.a.b();
        this.mLayout = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + layoutManager + " is already attached to a RecyclerView:" + layoutManager.mRecyclerView.exceptionLabel());
            }
            this.mLayout.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.b();
        requestLayout();
    }

    public void setOnFlingListener(@Nullable i iVar) {
        this.mOnFlingListener = iVar;
    }

    @Nullable
    public i getOnFlingListener() {
        return this.mOnFlingListener;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.mPendingSavedState == null) {
            if (this.mLayout != null) {
                savedState.a = this.mLayout.onSaveInstanceState();
            } else {
                savedState.a = null;
            }
        } else {
            savedState.a = this.mPendingSavedState.a;
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.mPendingSavedState = (SavedState) parcelable;
        super.onRestoreInstanceState(this.mPendingSavedState.getSuperState());
        if (this.mLayout == null || this.mPendingSavedState.a == null) {
            return;
        }
        this.mLayout.onRestoreInstanceState(this.mPendingSavedState.a);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    private void addAnimatingView(s sVar) {
        View view = sVar.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.b(getChildViewHolder(view));
        if (sVar.isTmpDetached()) {
            this.mChildHelper.a(view, -1, view.getLayoutParams(), true);
        } else if (z) {
            android.support.v7.widget.s sVar2 = this.mChildHelper;
            int a2 = sVar2.a.a(view);
            if (a2 < 0) {
                throw new IllegalArgumentException("view is not a child, cannot hide " + view);
            }
            sVar2.b.a(a2);
            sVar2.a(view);
        } else {
            this.mChildHelper.a(view, -1, true);
        }
    }

    boolean removeAnimatingView(View view) {
        eatRequestLayout();
        android.support.v7.widget.s sVar = this.mChildHelper;
        int a2 = sVar.a.a(view);
        boolean z = true;
        if (a2 == -1) {
            sVar.b(view);
        } else if (sVar.b.c(a2)) {
            sVar.b.d(a2);
            sVar.b(view);
            sVar.a.a(a2);
        } else {
            z = false;
        }
        if (z) {
            s childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.b(childViewHolderInt);
            this.mRecycler.a(childViewHolderInt);
        }
        resumeRequestLayout(!z);
        return z;
    }

    public LayoutManager getLayoutManager() {
        return this.mLayout;
    }

    public l getRecycledViewPool() {
        return this.mRecycler.d();
    }

    public void setRecycledViewPool(l lVar) {
        m mVar = this.mRecycler;
        if (mVar.g != null) {
            mVar.g.a();
        }
        mVar.g = lVar;
        if (lVar != null) {
            mVar.g.a(RecyclerView.this.getAdapter());
        }
    }

    public void setViewCacheExtension(q qVar) {
        this.mRecycler.h = qVar;
    }

    public void setItemViewCacheSize(int i2) {
        m mVar = this.mRecycler;
        mVar.e = i2;
        mVar.b();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    void setScrollState(int i2) {
        if (i2 == this.mScrollState) {
            return;
        }
        this.mScrollState = i2;
        if (i2 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i2);
    }

    public void addItemDecoration(f fVar, int i2) {
        if (this.mLayout != null) {
            this.mLayout.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.mItemDecorations.add(fVar);
        } else {
            this.mItemDecorations.add(i2, fVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addItemDecoration(f fVar) {
        addItemDecoration(fVar, -1);
    }

    public f getItemDecorationAt(int i2) {
        if (i2 < 0 || i2 >= this.mItemDecorations.size()) {
            return null;
        }
        return this.mItemDecorations.get(i2);
    }

    public void removeItemDecoration(f fVar) {
        if (this.mLayout != null) {
            this.mLayout.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(fVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(d dVar) {
        if (dVar == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = dVar;
        setChildrenDrawingOrderEnabled(this.mChildDrawingOrderCallback != null);
    }

    @Deprecated
    public void setOnScrollListener(k kVar) {
        this.mScrollListener = kVar;
    }

    public void addOnScrollListener(k kVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(kVar);
    }

    public void removeOnScrollListener(k kVar) {
        if (this.mScrollListeners != null) {
            this.mScrollListeners.remove(kVar);
        }
    }

    public void clearOnScrollListeners() {
        if (this.mScrollListeners != null) {
            this.mScrollListeners.clear();
        }
    }

    public void scrollToPosition(int i2) {
        if (this.mLayoutFrozen) {
            return;
        }
        stopScroll();
        if (this.mLayout == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        this.mLayout.scrollToPosition(i2);
        awakenScrollBars();
    }

    void jumpToPositionForSmoothScroller(int i2) {
        if (this.mLayout == null) {
            return;
        }
        this.mLayout.scrollToPosition(i2);
        awakenScrollBars();
    }

    public void smoothScrollToPosition(int i2) {
        if (this.mLayoutFrozen) {
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            this.mLayout.smoothScrollToPosition(this, this.mState, i2);
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        if (this.mLayout == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutFrozen) {
        } else {
            boolean canScrollHorizontally = this.mLayout.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            if (canScrollHorizontally || canScrollVertically) {
                if (!canScrollHorizontally) {
                    i2 = 0;
                }
                if (!canScrollVertically) {
                    i3 = 0;
                }
                scrollByInternal(i2, i3, null);
            }
        }
    }

    void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            TraceCompat.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            TraceCompat.endSection();
        } else if (this.mAdapterHelper.d()) {
            if (this.mAdapterHelper.a(4) && !this.mAdapterHelper.a(11)) {
                TraceCompat.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                eatRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.b();
                if (!this.mLayoutRequestEaten) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.c();
                    }
                }
                resumeRequestLayout(true);
                onExitLayoutOrScroll();
                TraceCompat.endSection();
            } else if (this.mAdapterHelper.d()) {
                TraceCompat.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                TraceCompat.endSection();
            }
        }
    }

    private boolean hasUpdatedView() {
        int a2 = this.mChildHelper.a();
        for (int i2 = 0; i2 < a2; i2++) {
            s childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(i2));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    boolean scrollByInternal(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            eatRequestLayout();
            onEnterLayoutOrScroll();
            TraceCompat.beginSection(TRACE_SCROLL_TAG);
            fillRemainingScrollValues(this.mState);
            if (i2 != 0) {
                i4 = this.mLayout.scrollHorizontallyBy(i2, this.mRecycler, this.mState);
                i5 = i2 - i4;
            } else {
                i4 = 0;
                i5 = 0;
            }
            if (i3 != 0) {
                i6 = this.mLayout.scrollVerticallyBy(i3, this.mRecycler, this.mState);
                i7 = i3 - i6;
            } else {
                i6 = 0;
                i7 = 0;
            }
            TraceCompat.endSection();
            repositionShadowingViews();
            onExitLayoutOrScroll();
            resumeRequestLayout(false);
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        if (dispatchNestedScroll(i4, i6, i5, i7, this.mScrollOffset, 0)) {
            this.mLastTouchX -= this.mScrollOffset[0];
            this.mLastTouchY -= this.mScrollOffset[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation(this.mScrollOffset[0], this.mScrollOffset[1]);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[0] = iArr[0] + this.mScrollOffset[0];
            int[] iArr2 = this.mNestedOffsets;
            iArr2[1] = iArr2[1] + this.mScrollOffset[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !MotionEventCompat.isFromSource(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i5, motionEvent.getY(), i7);
            }
            considerReleasingGlowsOnScroll(i2, i3);
        }
        if (i4 != 0 || i6 != 0) {
            dispatchOnScrolled(i4, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i4 == 0 && i6 == 0) ? false : true;
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        if (this.mLayout != null && this.mLayout.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        if (this.mLayout != null && this.mLayout.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    public int computeHorizontalScrollRange() {
        if (this.mLayout != null && this.mLayout.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    public int computeVerticalScrollOffset() {
        if (this.mLayout != null && this.mLayout.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    public int computeVerticalScrollExtent() {
        if (this.mLayout != null && this.mLayout.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    public int computeVerticalScrollRange() {
        if (this.mLayout != null && this.mLayout.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    void eatRequestLayout() {
        this.mEatRequestLayout++;
        if (this.mEatRequestLayout != 1 || this.mLayoutFrozen) {
            return;
        }
        this.mLayoutRequestEaten = false;
    }

    void resumeRequestLayout(boolean z) {
        if (this.mEatRequestLayout <= 0) {
            this.mEatRequestLayout = 1;
        }
        if (!z) {
            this.mLayoutRequestEaten = false;
        }
        if (this.mEatRequestLayout == 1) {
            if (z && this.mLayoutRequestEaten && !this.mLayoutFrozen && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutFrozen) {
                this.mLayoutRequestEaten = false;
            }
        }
        this.mEatRequestLayout--;
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.mLayoutFrozen) {
            assertNotInLayoutOrScroll("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.mLayoutFrozen = false;
                if (this.mLayoutRequestEaten && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutRequestEaten = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutFrozen = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public boolean isLayoutFrozen() {
        return this.mLayoutFrozen;
    }

    public void smoothScrollBy(int i2, int i3) {
        smoothScrollBy(i2, i3, null);
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator) {
        if (this.mLayout == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutFrozen) {
        } else {
            if (!this.mLayout.canScrollHorizontally()) {
                i2 = 0;
            }
            if (!this.mLayout.canScrollVertically()) {
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return;
            }
            r rVar = this.mViewFlinger;
            int a2 = rVar.a(i2, i3, 0, 0);
            if (interpolator == null) {
                interpolator = sQuinticInterpolator;
            }
            rVar.a(i2, i3, a2, interpolator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    public boolean fling(int i2, int i3) {
        if (this.mLayout == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutFrozen) {
            return false;
        } else {
            int canScrollHorizontally = this.mLayout.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            int i4 = (canScrollHorizontally == 0 || Math.abs(i2) < this.mMinFlingVelocity) ? 0 : i2;
            int i5 = (!canScrollVertically || Math.abs(i3) < this.mMinFlingVelocity) ? 0 : i3;
            if (i4 == 0 && i5 == 0) {
                return false;
            }
            float f2 = i4;
            float f3 = i5;
            if (!dispatchNestedPreFling(f2, f3)) {
                boolean z = canScrollHorizontally != 0 || canScrollVertically;
                dispatchNestedFling(f2, f3, z);
                if (this.mOnFlingListener != null && this.mOnFlingListener.onFling(i4, i5)) {
                    return true;
                }
                if (z) {
                    if (canScrollVertically) {
                        canScrollHorizontally = (canScrollHorizontally == true ? 1 : 0) | 2;
                    }
                    startNestedScroll(canScrollHorizontally, 1);
                    int max = Math.max(-this.mMaxFlingVelocity, Math.min(i4, this.mMaxFlingVelocity));
                    int max2 = Math.max(-this.mMaxFlingVelocity, Math.min(i5, this.mMaxFlingVelocity));
                    r rVar = this.mViewFlinger;
                    RecyclerView.this.setScrollState(2);
                    rVar.b = 0;
                    rVar.a = 0;
                    rVar.c.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                    rVar.a();
                    return true;
                }
            }
            return false;
        }
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.b();
        if (this.mLayout != null) {
            this.mLayout.stopSmoothScroller();
        }
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            android.support.v4.widget.EdgeEffectCompat.onPull(r3, r4, r9)
        L1f:
            r9 = 1
            goto L3c
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            android.support.v4.widget.EdgeEffectCompat.onPull(r3, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            android.support.v4.widget.EdgeEffectCompat.onPull(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            android.support.v4.widget.EdgeEffectCompat.onPull(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void releaseGlows() {
        boolean z;
        if (this.mLeftGlow != null) {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        if (this.mTopGlow != null) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        if (this.mRightGlow != null) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        if (this.mBottomGlow != null) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    void considerReleasingGlowsOnScroll(int i2, int i3) {
        boolean z;
        if (this.mLeftGlow == null || this.mLeftGlow.isFinished() || i2 <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        if (this.mRightGlow != null && !this.mRightGlow.isFinished() && i2 < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        if (this.mTopGlow != null && !this.mTopGlow.isFinished() && i3 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        if (this.mBottomGlow != null && !this.mBottomGlow.isFinished() && i3 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    void absorbGlows(int i2, int i3) {
        if (i2 < 0) {
            ensureLeftGlow();
            this.mLeftGlow.onAbsorb(-i2);
        } else if (i2 > 0) {
            ensureRightGlow();
            this.mRightGlow.onAbsorb(i2);
        }
        if (i3 < 0) {
            ensureTopGlow();
            this.mTopGlow.onAbsorb(-i3);
        } else if (i3 > 0) {
            ensureBottomGlow();
            this.mBottomGlow.onAbsorb(i3);
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        this.mLeftGlow = new EdgeEffect(getContext());
        if (this.mClipToPadding) {
            this.mLeftGlow.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            this.mLeftGlow.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        this.mRightGlow = new EdgeEffect(getContext());
        if (this.mClipToPadding) {
            this.mRightGlow.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            this.mRightGlow.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        this.mTopGlow = new EdgeEffect(getContext());
        if (this.mClipToPadding) {
            this.mTopGlow.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            this.mTopGlow.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        this.mBottomGlow = new EdgeEffect(getContext());
        if (this.mClipToPadding) {
            this.mBottomGlow.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            this.mBottomGlow.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View view2;
        boolean z;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i2);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutFrozen) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i2 == 2 || i2 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i3 = i2 == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i3;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.canScrollHorizontally()) {
                int i4 = (this.mLayout.getLayoutDirection() == 1) ^ (i2 == 2) ? 66 : 17;
                z = focusFinder.findNextFocus(this, view, i4) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i4;
                }
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                eatRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i2, this.mRecycler, this.mState);
                resumeRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i2);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (findNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                eatRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i2, this.mRecycler, this.mState);
                resumeRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        } else {
            requestChildOnScreen(view2, null);
            return view;
        }
    }

    private boolean isPreferredNextFocus(View view, View view2, int i2) {
        if (view2 == null || view2 == this) {
            return false;
        }
        if (view == null) {
            return true;
        }
        if (i2 == 2 || i2 == 1) {
            if (isPreferredNextFocusAbsolute(view, view2, (i2 == 2) ^ (this.mLayout.getLayoutDirection() == 1) ? 66 : 17)) {
                return true;
            }
            if (i2 == 2) {
                return isPreferredNextFocusAbsolute(view, view2, 130);
            }
            return isPreferredNextFocusAbsolute(view, view2, 33);
        }
        return isPreferredNextFocusAbsolute(view, view2, i2);
    }

    private boolean isPreferredNextFocusAbsolute(View view, View view2, int i2) {
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        if (i2 == 17) {
            return (this.mTempRect.right > this.mTempRect2.right || this.mTempRect.left >= this.mTempRect2.right) && this.mTempRect.left > this.mTempRect2.left;
        } else if (i2 == 33) {
            return (this.mTempRect.bottom > this.mTempRect2.bottom || this.mTempRect.top >= this.mTempRect2.bottom) && this.mTempRect.top > this.mTempRect2.top;
        } else if (i2 == 66) {
            return (this.mTempRect.left < this.mTempRect2.left || this.mTempRect.right <= this.mTempRect2.left) && this.mTempRect.right < this.mTempRect2.right;
        } else if (i2 == 130) {
            return (this.mTempRect.top < this.mTempRect2.top || this.mTempRect.bottom <= this.mTempRect2.top) && this.mTempRect.bottom < this.mTempRect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be absolute. received:" + i2 + exceptionLabel());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    private void requestChildOnScreen(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof g) {
            g gVar = (g) layoutParams;
            if (!gVar.e) {
                Rect rect = gVar.d;
                this.mTempRect.left -= rect.left;
                this.mTempRect.right += rect.right;
                this.mTempRect.top -= rect.top;
                this.mTempRect.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (this.mLayout == null || !this.mLayout.onAddFocusables(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r0 >= 30.0f) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.mLayoutOrScrollCounter = r0
            r1 = 1
            r4.mIsAttached = r1
            boolean r2 = r4.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            r4.mFirstLayoutComplete = r1
            android.support.v7.widget.RecyclerView$LayoutManager r1 = r4.mLayout
            if (r1 == 0) goto L20
            android.support.v7.widget.RecyclerView$LayoutManager r1 = r4.mLayout
            r1.dispatchAttachedToWindow(r4)
        L20:
            r4.mPostedAnimatorRunner = r0
            boolean r0 = android.support.v7.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L6d
            java.lang.ThreadLocal<android.support.v7.widget.ab> r0 = android.support.v7.widget.ab.a
            java.lang.Object r0 = r0.get()
            android.support.v7.widget.ab r0 = (android.support.v7.widget.ab) r0
            r4.mGapWorker = r0
            android.support.v7.widget.ab r0 = r4.mGapWorker
            if (r0 != 0) goto L66
            android.support.v7.widget.ab r0 = new android.support.v7.widget.ab
            r0.<init>()
            r4.mGapWorker = r0
            android.view.Display r0 = android.support.v4.view.ViewCompat.getDisplay(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L54
            if (r0 == 0) goto L54
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L54
            goto L56
        L54:
            r0 = 1114636288(0x42700000, float:60.0)
        L56:
            android.support.v7.widget.ab r1 = r4.mGapWorker
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.d = r2
            java.lang.ThreadLocal<android.support.v7.widget.ab> r0 = android.support.v7.widget.ab.a
            android.support.v7.widget.ab r1 = r4.mGapWorker
            r0.set(r1)
        L66:
            android.support.v7.widget.ab r0 = r4.mGapWorker
            java.util.ArrayList<android.support.v7.widget.RecyclerView> r0 = r0.b
            r0.add(r4)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mItemAnimator != null) {
            this.mItemAnimator.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        if (this.mLayout != null) {
            this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        bc.a.b();
        if (ALLOW_THREAD_GAP_WORK) {
            this.mGapWorker.b.remove(this);
            this.mGapWorker = null;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(exceptionLabel()));
        }
    }

    public void addOnItemTouchListener(j jVar) {
        this.mOnItemTouchListeners.add(jVar);
    }

    public void removeOnItemTouchListener(j jVar) {
        this.mOnItemTouchListeners.remove(jVar);
        if (this.mActiveOnItemTouchListener == jVar) {
            this.mActiveOnItemTouchListener = null;
        }
    }

    private boolean dispatchOnItemTouchIntercept(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.mActiveOnItemTouchListener = null;
        }
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            j jVar = this.mOnItemTouchListeners.get(i2);
            if (jVar.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.mActiveOnItemTouchListener = jVar;
                return true;
            }
        }
        return false;
    }

    private boolean dispatchOnItemTouch(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.mActiveOnItemTouchListener != null) {
            if (action == 0) {
                this.mActiveOnItemTouchListener = null;
            } else {
                this.mActiveOnItemTouchListener.onTouchEvent(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.mActiveOnItemTouchListener = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.mOnItemTouchListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                j jVar = this.mOnItemTouchListeners.get(i2);
                if (jVar.onInterceptTouchEvent(this, motionEvent)) {
                    this.mActiveOnItemTouchListener = jVar;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutFrozen) {
            return false;
        }
        if (dispatchOnItemTouchIntercept(motionEvent)) {
            cancelTouch();
            return true;
        } else if (this.mLayout == null) {
            return false;
        } else {
            boolean canScrollHorizontally = this.mLayout.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            switch (actionMasked) {
                case 0:
                    if (this.mIgnoreMotionEventTillDown) {
                        this.mIgnoreMotionEventTillDown = false;
                    }
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x;
                    this.mInitialTouchX = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y;
                    this.mInitialTouchY = y;
                    if (this.mScrollState == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                    }
                    int[] iArr = this.mNestedOffsets;
                    this.mNestedOffsets[1] = 0;
                    iArr[0] = 0;
                    int i2 = canScrollHorizontally;
                    if (canScrollVertically) {
                        i2 = (canScrollHorizontally ? 1 : 0) | 2;
                    }
                    startNestedScroll(i2, 0);
                    break;
                case 1:
                    this.mVelocityTracker.clear();
                    stopNestedScroll(0);
                    break;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex < 0) {
                        Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i3 = x2 - this.mInitialTouchX;
                        int i4 = y2 - this.mInitialTouchY;
                        if (!canScrollHorizontally || Math.abs(i3) <= this.mTouchSlop) {
                            z = false;
                        } else {
                            this.mLastTouchX = x2;
                            z = true;
                        }
                        if (canScrollVertically && Math.abs(i4) > this.mTouchSlop) {
                            this.mLastTouchY = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                            break;
                        }
                    }
                    break;
                case 3:
                    cancelTouch();
                    break;
                case 5:
                    this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.mLastTouchX = x3;
                    this.mInitialTouchX = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.mLastTouchY = y3;
                    this.mInitialTouchY = y3;
                    break;
                case 6:
                    onPointerUp(motionEvent);
                    break;
            }
            return this.mScrollState == 1;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mOnItemTouchListeners.get(i2).onRequestDisallowInterceptTouchEvent(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (this.mLayoutFrozen || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchOnItemTouch(motionEvent)) {
            cancelTouch();
            return true;
        } else if (this.mLayout == null) {
            return false;
        } else {
            boolean canScrollHorizontally = this.mLayout.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                int[] iArr = this.mNestedOffsets;
                this.mNestedOffsets[1] = 0;
                iArr[0] = 0;
            }
            obtain.offsetLocation(this.mNestedOffsets[0], this.mNestedOffsets[1]);
            switch (actionMasked) {
                case 0:
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x;
                    this.mInitialTouchX = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y;
                    this.mInitialTouchY = y;
                    int i2 = canScrollHorizontally;
                    if (canScrollVertically) {
                        i2 = (canScrollHorizontally ? 1 : 0) | 2;
                    }
                    startNestedScroll(i2, 0);
                    break;
                case 1:
                    this.mVelocityTracker.addMovement(obtain);
                    this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                    float f2 = canScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                    float f3 = canScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                    if ((f2 == 0.0f && f3 == 0.0f) || !fling((int) f2, (int) f3)) {
                        setScrollState(0);
                    }
                    resetTouch();
                    z2 = true;
                    break;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex < 0) {
                        Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    int i3 = this.mLastTouchX - x2;
                    int i4 = this.mLastTouchY - y2;
                    if (dispatchNestedPreScroll(i3, i4, this.mScrollConsumed, this.mScrollOffset, 0)) {
                        i3 -= this.mScrollConsumed[0];
                        i4 -= this.mScrollConsumed[1];
                        obtain.offsetLocation(this.mScrollOffset[0], this.mScrollOffset[1]);
                        int[] iArr2 = this.mNestedOffsets;
                        iArr2[0] = iArr2[0] + this.mScrollOffset[0];
                        int[] iArr3 = this.mNestedOffsets;
                        iArr3[1] = iArr3[1] + this.mScrollOffset[1];
                    }
                    if (this.mScrollState != 1) {
                        if (!canScrollHorizontally || Math.abs(i3) <= this.mTouchSlop) {
                            z = false;
                        } else {
                            if (i3 > 0) {
                                i3 -= this.mTouchSlop;
                            } else {
                                i3 += this.mTouchSlop;
                            }
                            z = true;
                        }
                        if (canScrollVertically && Math.abs(i4) > this.mTouchSlop) {
                            if (i4 > 0) {
                                i4 -= this.mTouchSlop;
                            } else {
                                i4 += this.mTouchSlop;
                            }
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                    if (this.mScrollState == 1) {
                        this.mLastTouchX = x2 - this.mScrollOffset[0];
                        this.mLastTouchY = y2 - this.mScrollOffset[1];
                        if (scrollByInternal(canScrollHorizontally ? i3 : 0, canScrollVertically ? i4 : 0, obtain)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        if (this.mGapWorker != null && (i3 != 0 || i4 != 0)) {
                            this.mGapWorker.a(this, i3, i4);
                            break;
                        }
                    }
                    break;
                case 3:
                    cancelTouch();
                    break;
                case 5:
                    this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.mLastTouchX = x3;
                    this.mInitialTouchX = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.mLastTouchY = y3;
                    this.mInitialTouchY = y3;
                    break;
                case 6:
                    onPointerUp(motionEvent);
                    break;
            }
            if (!z2) {
                this.mVelocityTracker.addMovement(obtain);
            }
            obtain.recycle();
            return true;
        }
    }

    private void resetTouch() {
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void cancelTouch() {
        resetTouch();
        setScrollState(0);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i2);
            int x = (int) (motionEvent.getX(i2) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i2) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutFrozen
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            android.support.v7.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            android.support.v7.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            android.support.v7.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6a:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.scrollByInternal(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.mLayout == null) {
            defaultOnMeasure(i2, i3);
            return;
        }
        boolean z = false;
        if (this.mLayout.mAutoMeasure) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.d == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i2, i3);
            this.mState.i = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i2, i3);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.i = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i2, i3);
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                eatRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                if (this.mState.k) {
                    this.mState.g = true;
                } else {
                    this.mAdapterHelper.e();
                    this.mState.g = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                resumeRequestLayout(false);
            } else if (this.mState.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            if (this.mAdapter != null) {
                this.mState.e = this.mAdapter.getItemCount();
            } else {
                this.mState.e = 0;
            }
            eatRequestLayout();
            this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
            resumeRequestLayout(false);
            this.mState.g = false;
        }
    }

    void defaultOnMeasure(int i2, int i3) {
        setMeasuredDimension(LayoutManager.chooseSize(i2, getPaddingLeft() + getPaddingRight(), ViewCompat.getMinimumWidth(this)), LayoutManager.chooseSize(i3, getPaddingTop() + getPaddingBottom(), ViewCompat.getMinimumHeight(this)));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        invalidateGlows();
    }

    public void setItemAnimator(ItemAnimator itemAnimator) {
        if (this.mItemAnimator != null) {
            this.mItemAnimator.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = itemAnimator;
        if (this.mItemAnimator != null) {
            this.mItemAnimator.setListener(this.mItemAnimatorListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onExitLayoutOrScroll(boolean z) {
        this.mLayoutOrScrollCounter--;
        if (this.mLayoutOrScrollCounter <= 0) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    boolean isAccessibilityEnabled() {
        return this.mAccessibilityManager != null && this.mAccessibilityManager.isEnabled();
    }

    private void dispatchContentChangedIfNecessary() {
        int i2 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i2 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        AccessibilityEventCompat.setContentChangeTypes(obtain, i2);
        sendAccessibilityEventUnchecked(obtain);
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (isComputingLayout()) {
            int contentChangeTypes = accessibilityEvent != null ? AccessibilityEventCompat.getContentChangeTypes(accessibilityEvent) : 0;
            if (contentChangeTypes == 0) {
                contentChangeTypes = 0;
            }
            this.mEatenAccessibilityChangeFlags = contentChangeTypes | this.mEatenAccessibilityChangeFlags;
            return true;
        }
        return false;
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public ItemAnimator getItemAnimator() {
        return this.mItemAnimator;
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        ViewCompat.postOnAnimation(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.a();
            this.mLayout.onItemsChanged(this);
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.b();
        } else {
            this.mAdapterHelper.e();
        }
        boolean z = false;
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.j = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z2 || this.mLayout.mRequestedSimpleAnimations) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.hasStableIds());
        State state = this.mState;
        if (this.mState.j && z2 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z = true;
        }
        state.k = z;
    }

    void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            boolean z = false;
            this.mState.i = false;
            if (this.mState.d == 1) {
                dispatchLayoutStep1();
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            } else {
                android.support.v7.widget.d dVar = this.mAdapterHelper;
                if (!dVar.b.isEmpty() && !dVar.a.isEmpty()) {
                    z = true;
                }
                if (z || this.mLayout.getWidth() != getWidth() || this.mLayout.getHeight() != getHeight()) {
                    this.mLayout.setExactMeasureSpecsFrom(this);
                    dispatchLayoutStep2();
                } else {
                    this.mLayout.setExactMeasureSpecsFrom(this);
                }
            }
            dispatchLayoutStep3();
        }
    }

    private void saveFocusInfo() {
        int adapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        s findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.m = this.mAdapter.hasStableIds() ? findContainingViewHolder.getItemId() : -1L;
        State state = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            adapterPosition = -1;
        } else {
            adapterPosition = findContainingViewHolder.isRemoved() ? findContainingViewHolder.mOldPosition : findContainingViewHolder.getAdapterPosition();
        }
        state.l = adapterPosition;
        this.mState.n = getDeepestFocusedViewWithId(findContainingViewHolder.itemView);
    }

    private void resetFocusInfo() {
        this.mState.m = -1L;
        this.mState.l = -1;
        this.mState.n = -1;
    }

    @Nullable
    private View findNextViewToFocus() {
        s findViewHolderForAdapterPosition;
        int i2 = this.mState.l != -1 ? this.mState.l : 0;
        int c2 = this.mState.c();
        for (int i3 = i2; i3 < c2; i3++) {
            s findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(c2, i2);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition.itemView;
            }
        }
    }

    private void recoverFocusFromState() {
        View view;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                if (this.mChildHelper.a() == 0) {
                    requestFocus();
                    return;
                }
            } else if (!this.mChildHelper.d(focusedChild)) {
                return;
            }
        }
        View view2 = null;
        s findViewHolderForItemId = (this.mState.m == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.m);
        if (findViewHolderForItemId == null || this.mChildHelper.d(findViewHolderForItemId.itemView) || !findViewHolderForItemId.itemView.hasFocusable()) {
            if (this.mChildHelper.a() > 0) {
                view2 = findNextViewToFocus();
            }
        } else {
            view2 = findViewHolderForItemId.itemView;
        }
        if (view2 != null) {
            if (this.mState.n == -1 || (view = view2.findViewById(this.mState.n)) == null || !view.isFocusable()) {
                view = view2;
            }
            view.requestFocus();
        }
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    final void fillRemainingScrollValues(State state) {
        if (getScrollState() != 2) {
            state.o = 0;
            state.p = 0;
            return;
        }
        OverScroller overScroller = this.mViewFlinger.c;
        state.o = overScroller.getFinalX() - overScroller.getCurrX();
        state.p = overScroller.getFinalY() - overScroller.getCurrY();
    }

    private void dispatchLayoutStep1() {
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.i = false;
        eatRequestLayout();
        this.mViewInfoStore.a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        this.mState.h = this.mState.j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        this.mState.g = this.mState.k;
        this.mState.e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.j) {
            int a2 = this.mChildHelper.a();
            for (int i2 = 0; i2 < a2; i2++) {
                s childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(i2));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.a(childViewHolderInt, this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.a(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.k) {
            saveOldPositions();
            boolean z = this.mState.f;
            this.mState.f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, this.mState);
            this.mState.f = z;
            for (int i3 = 0; i3 < this.mChildHelper.a(); i3++) {
                s childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.b(i3));
                if (!childViewHolderInt2.shouldIgnore()) {
                    bc.a aVar = this.mViewInfoStore.a.get(childViewHolderInt2);
                    if (!((aVar == null || (aVar.a & 4) == 0) ? false : true)) {
                        int buildAdapterChangeFlagsForAnimations = ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                        boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                        if (!hasAnyOfTheFlags) {
                            buildAdapterChangeFlagsForAnimations |= 4096;
                        }
                        ItemAnimator.c recordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, buildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                        if (hasAnyOfTheFlags) {
                            recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, recordPreLayoutInformation);
                        } else {
                            bc bcVar = this.mViewInfoStore;
                            bc.a aVar2 = bcVar.a.get(childViewHolderInt2);
                            if (aVar2 == null) {
                                aVar2 = bc.a.a();
                                bcVar.a.put(childViewHolderInt2, aVar2);
                            }
                            aVar2.a |= 2;
                            aVar2.b = recordPreLayoutInformation;
                        }
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        resumeRequestLayout(false);
        this.mState.d = 2;
    }

    private void dispatchLayoutStep2() {
        eatRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.e();
        this.mState.e = this.mAdapter.getItemCount();
        this.mState.c = 0;
        this.mState.g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, this.mState);
        this.mState.f = false;
        this.mPendingSavedState = null;
        this.mState.j = this.mState.j && this.mItemAnimator != null;
        this.mState.d = 4;
        onExitLayoutOrScroll();
        resumeRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.a(4);
        eatRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.d = 1;
        if (this.mState.j) {
            for (int a2 = this.mChildHelper.a() - 1; a2 >= 0; a2--) {
                s childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(a2));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    ItemAnimator.c recordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    s sVar = this.mViewInfoStore.b.get(changedHolderKey);
                    if (sVar != null && !sVar.shouldIgnore()) {
                        boolean a3 = this.mViewInfoStore.a(sVar);
                        boolean a4 = this.mViewInfoStore.a(childViewHolderInt);
                        if (a3 && sVar == childViewHolderInt) {
                            this.mViewInfoStore.b(childViewHolderInt, recordPostLayoutInformation);
                        } else {
                            ItemAnimator.c a5 = this.mViewInfoStore.a(sVar, 4);
                            this.mViewInfoStore.b(childViewHolderInt, recordPostLayoutInformation);
                            ItemAnimator.c a6 = this.mViewInfoStore.a(childViewHolderInt, 8);
                            if (a5 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, sVar);
                            } else {
                                animateChange(sVar, childViewHolderInt, a5, a6, a3, a4);
                            }
                        }
                    } else {
                        this.mViewInfoStore.b(childViewHolderInt, recordPostLayoutInformation);
                    }
                }
            }
            bc bcVar = this.mViewInfoStore;
            bc.b bVar = this.mViewInfoProcessCallback;
            for (int size = bcVar.a.size() - 1; size >= 0; size--) {
                s keyAt = bcVar.a.keyAt(size);
                bc.a removeAt = bcVar.a.removeAt(size);
                if ((removeAt.a & 3) == 3) {
                    bVar.a(keyAt);
                } else if ((removeAt.a & 1) != 0) {
                    if (removeAt.b == null) {
                        bVar.a(keyAt);
                    } else {
                        bVar.a(keyAt, removeAt.b, removeAt.c);
                    }
                } else if ((removeAt.a & 14) == 14) {
                    bVar.b(keyAt, removeAt.b, removeAt.c);
                } else if ((removeAt.a & 12) == 12) {
                    bVar.c(keyAt, removeAt.b, removeAt.c);
                } else if ((removeAt.a & 4) != 0) {
                    bVar.a(keyAt, removeAt.b, null);
                } else if ((removeAt.a & 8) != 0) {
                    bVar.b(keyAt, removeAt.b, removeAt.c);
                }
                bc.a.a(removeAt);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        this.mState.b = this.mState.e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mState.j = false;
        this.mState.k = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        if (this.mRecycler.b != null) {
            this.mRecycler.b.clear();
        }
        if (this.mLayout.mPrefetchMaxObservedInInitialPrefetch) {
            this.mLayout.mPrefetchMaxCountObserved = 0;
            this.mLayout.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.b();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        resumeRequestLayout(false);
        this.mViewInfoStore.a();
        if (didChildRangeChange(this.mMinMaxLayoutPositions[0], this.mMinMaxLayoutPositions[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private void handleMissingPreInfoForChangeError(long j2, s sVar, s sVar2) {
        int a2 = this.mChildHelper.a();
        for (int i2 = 0; i2 < a2; i2++) {
            s childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(i2));
            if (childViewHolderInt != sVar && getChangedHolderKey(childViewHolderInt) == j2) {
                if (this.mAdapter != null && this.mAdapter.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + sVar + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + sVar + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + sVar2 + " cannot be found but it is necessary for " + sVar + exceptionLabel());
    }

    void recordAnimationInfoIfBouncedHiddenView(s sVar, ItemAnimator.c cVar) {
        sVar.setFlags(0, 8192);
        if (this.mState.h && sVar.isUpdated() && !sVar.isRemoved() && !sVar.shouldIgnore()) {
            this.mViewInfoStore.a(getChangedHolderKey(sVar), sVar);
        }
        this.mViewInfoStore.a(sVar, cVar);
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int a2 = this.mChildHelper.a();
        if (a2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < a2; i4++) {
            s childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(i4));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i2) {
                    i2 = layoutPosition;
                }
                if (layoutPosition > i3) {
                    i3 = layoutPosition;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    private boolean didChildRangeChange(int i2, int i3) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        return (this.mMinMaxLayoutPositions[0] == i2 && this.mMinMaxLayoutPositions[1] == i3) ? false : true;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        s childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    long getChangedHolderKey(s sVar) {
        return this.mAdapter.hasStableIds() ? sVar.getItemId() : sVar.mPosition;
    }

    void animateAppearance(@NonNull s sVar, @Nullable ItemAnimator.c cVar, @NonNull ItemAnimator.c cVar2) {
        sVar.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(sVar, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(@NonNull s sVar, @NonNull ItemAnimator.c cVar, @Nullable ItemAnimator.c cVar2) {
        addAnimatingView(sVar);
        sVar.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(sVar, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void animateChange(@NonNull s sVar, @NonNull s sVar2, @NonNull ItemAnimator.c cVar, @NonNull ItemAnimator.c cVar2, boolean z, boolean z2) {
        sVar.setIsRecyclable(false);
        if (z) {
            addAnimatingView(sVar);
        }
        if (sVar != sVar2) {
            if (z2) {
                addAnimatingView(sVar2);
            }
            sVar.mShadowedHolder = sVar2;
            addAnimatingView(sVar);
            this.mRecycler.b(sVar);
            sVar2.setIsRecyclable(false);
            sVar2.mShadowingHolder = sVar;
        }
        if (this.mItemAnimator.animateChange(sVar, sVar2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        TraceCompat.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        TraceCompat.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mEatRequestLayout == 0 && !this.mLayoutFrozen) {
            super.requestLayout();
        } else {
            this.mLayoutRequestEaten = true;
        }
    }

    public void markItemDecorInsetsDirty() {
        int b2 = this.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ((g) this.mChildHelper.c(i2).getLayoutParams()).e = true;
        }
        m mVar = this.mRecycler;
        int size = mVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = (g) mVar.c.get(i3).itemView.getLayoutParams();
            if (gVar != null) {
                gVar.e = true;
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).onDrawOver(canvas, this, this.mState);
        }
        if (this.mLeftGlow == null || this.mLeftGlow.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            z = this.mLeftGlow != null && this.mLeftGlow.draw(canvas);
            canvas.restoreToCount(save);
        }
        if (this.mTopGlow != null && !this.mTopGlow.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            z |= this.mTopGlow != null && this.mTopGlow.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (this.mRightGlow != null && !this.mRightGlow.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            z |= this.mRightGlow != null && this.mRightGlow.draw(canvas);
            canvas.restoreToCount(save3);
        }
        if (this.mBottomGlow == null || this.mBottomGlow.isFinished()) {
            z2 = z;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            if (this.mBottomGlow != null && this.mBottomGlow.draw(canvas)) {
                z3 = true;
            }
            z2 = z3 | z;
            canvas.restoreToCount(save4);
        }
        if (!z2 && this.mItemAnimator != null && this.mItemDecorations.size() > 0 && this.mItemAnimator.isRunning()) {
            z2 = true;
        }
        if (z2) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).onDraw(canvas, this, this.mState);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && this.mLayout.checkLayoutParams((g) layoutParams);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.mLayout == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return this.mLayout.generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.mLayout == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return this.mLayout.generateLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (this.mLayout == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return this.mLayout.generateLayoutParams(layoutParams);
    }

    public boolean isAnimating() {
        return this.mItemAnimator != null && this.mItemAnimator.isRunning();
    }

    void saveOldPositions() {
        int b2 = this.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            s childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i2));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    void clearOldPositions() {
        int b2 = this.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            s childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i2));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        m mVar = this.mRecycler;
        int size = mVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            mVar.c.get(i3).clearOldPosition();
        }
        int size2 = mVar.a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            mVar.a.get(i4).clearOldPosition();
        }
        if (mVar.b != null) {
            int size3 = mVar.b.size();
            for (int i5 = 0; i5 < size3; i5++) {
                mVar.b.get(i5).clearOldPosition();
            }
        }
    }

    void offsetPositionRecordsForMove(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int b2 = this.mChildHelper.b();
        if (i2 < i3) {
            i5 = i2;
            i4 = i3;
            i6 = -1;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i10 = 0; i10 < b2; i10++) {
            s childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i10));
            if (childViewHolderInt != null && childViewHolderInt.mPosition >= i5 && childViewHolderInt.mPosition <= i4) {
                if (childViewHolderInt.mPosition == i2) {
                    childViewHolderInt.offsetPosition(i3 - i2, false);
                } else {
                    childViewHolderInt.offsetPosition(i6, false);
                }
                this.mState.f = true;
            }
        }
        m mVar = this.mRecycler;
        if (i2 < i3) {
            i8 = i2;
            i7 = i3;
            i9 = -1;
        } else {
            i7 = i2;
            i8 = i3;
            i9 = 1;
        }
        int size = mVar.c.size();
        for (int i11 = 0; i11 < size; i11++) {
            s sVar = mVar.c.get(i11);
            if (sVar != null && sVar.mPosition >= i8 && sVar.mPosition <= i7) {
                if (sVar.mPosition == i2) {
                    sVar.offsetPosition(i3 - i2, false);
                } else {
                    sVar.offsetPosition(i9, false);
                }
            }
        }
        requestLayout();
    }

    void offsetPositionRecordsForInsert(int i2, int i3) {
        int b2 = this.mChildHelper.b();
        for (int i4 = 0; i4 < b2; i4++) {
            s childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i2) {
                childViewHolderInt.offsetPosition(i3, false);
                this.mState.f = true;
            }
        }
        m mVar = this.mRecycler;
        int size = mVar.c.size();
        for (int i5 = 0; i5 < size; i5++) {
            s sVar = mVar.c.get(i5);
            if (sVar != null && sVar.mPosition >= i2) {
                sVar.offsetPosition(i3, true);
            }
        }
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i2, int i3, boolean z) {
        int i4 = i2 + i3;
        int b2 = this.mChildHelper.b();
        for (int i5 = 0; i5 < b2; i5++) {
            s childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i5));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                if (childViewHolderInt.mPosition >= i4) {
                    childViewHolderInt.offsetPosition(-i3, z);
                    this.mState.f = true;
                } else if (childViewHolderInt.mPosition >= i2) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i2 - 1, -i3, z);
                    this.mState.f = true;
                }
            }
        }
        m mVar = this.mRecycler;
        for (int size = mVar.c.size() - 1; size >= 0; size--) {
            s sVar = mVar.c.get(size);
            if (sVar != null) {
                if (sVar.mPosition >= i4) {
                    sVar.offsetPosition(-i3, z);
                } else if (sVar.mPosition >= i2) {
                    sVar.addFlags(8);
                    mVar.c(size);
                }
            }
        }
        requestLayout();
    }

    void viewRangeUpdate(int i2, int i3, Object obj) {
        int i4;
        int b2 = this.mChildHelper.b();
        int i5 = i3 + i2;
        for (int i6 = 0; i6 < b2; i6++) {
            View c2 = this.mChildHelper.c(i6);
            s childViewHolderInt = getChildViewHolderInt(c2);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i2 && childViewHolderInt.mPosition < i5) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((g) c2.getLayoutParams()).e = true;
            }
        }
        m mVar = this.mRecycler;
        for (int size = mVar.c.size() - 1; size >= 0; size--) {
            s sVar = mVar.c.get(size);
            if (sVar != null && (i4 = sVar.mPosition) >= i2 && i4 < i5) {
                sVar.addFlags(2);
                mVar.c(size);
            }
        }
    }

    boolean canReuseUpdatedViewHolder(s sVar) {
        return this.mItemAnimator == null || this.mItemAnimator.canReuseUpdatedViewHolder(sVar, sVar.getUnmodifiedPayloads());
    }

    void setDataSetChangedAfterLayout() {
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void markKnownViewsInvalid() {
        int b2 = this.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            s childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i2));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        m mVar = this.mRecycler;
        if (RecyclerView.this.mAdapter != null && RecyclerView.this.mAdapter.hasStableIds()) {
            int size = mVar.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                s sVar = mVar.c.get(i3);
                if (sVar != null) {
                    sVar.addFlags(6);
                    sVar.addChangePayload(null);
                }
            }
            return;
        }
        mVar.c();
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        if (this.mLayout != null) {
            this.mLayout.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public s getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        return r3;
     */
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    @Nullable
    public s findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((g) view.getLayoutParams()).c;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public int getChildAdapterPosition(View view) {
        s childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAdapterPosition();
        }
        return -1;
    }

    public int getChildLayoutPosition(View view) {
        s childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    public long getChildItemId(View view) {
        s childViewHolderInt;
        if (this.mAdapter == null || !this.mAdapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    @Deprecated
    public s findViewHolderForPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    public s findViewHolderForLayoutPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    public s findViewHolderForAdapterPosition(int i2) {
        s sVar = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int b2 = this.mChildHelper.b();
        for (int i3 = 0; i3 < b2; i3++) {
            s childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i3));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionFor(childViewHolderInt) == i2) {
                if (!this.mChildHelper.d(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                sVar = childViewHolderInt;
            }
        }
        return sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.support.v7.widget.RecyclerView.s findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            android.support.v7.widget.s r0 = r5.mChildHelper
            int r0 = r0.b()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L39
            android.support.v7.widget.s r3 = r5.mChildHelper
            android.view.View r3 = r3.c(r2)
            android.support.v7.widget.RecyclerView$s r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L36
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L36
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L29
            goto L36
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 != r6) goto L36
        L29:
            android.support.v7.widget.s r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.d(r4)
            if (r1 == 0) goto L35
            r1 = r3
            goto L36
        L35:
            return r3
        L36:
            int r2 = r2 + 1
            goto L8
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.findViewHolderForPosition(int, boolean):android.support.v7.widget.RecyclerView$s");
    }

    public s findViewHolderForItemId(long j2) {
        s sVar = null;
        if (this.mAdapter == null || !this.mAdapter.hasStableIds()) {
            return null;
        }
        int b2 = this.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            s childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j2) {
                if (!this.mChildHelper.d(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                sVar = childViewHolderInt;
            }
        }
        return sVar;
    }

    public View findChildViewUnder(float f2, float f3) {
        for (int a2 = this.mChildHelper.a() - 1; a2 >= 0; a2--) {
            View b2 = this.mChildHelper.b(a2);
            float translationX = b2.getTranslationX();
            float translationY = b2.getTranslationY();
            if (f2 >= b2.getLeft() + translationX && f2 <= b2.getRight() + translationX && f3 >= b2.getTop() + translationY && f3 <= b2.getBottom() + translationY) {
                return b2;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public void offsetChildrenVertical(int i2) {
        int a2 = this.mChildHelper.a();
        for (int i3 = 0; i3 < a2; i3++) {
            this.mChildHelper.b(i3).offsetTopAndBottom(i2);
        }
    }

    public void offsetChildrenHorizontal(int i2) {
        int a2 = this.mChildHelper.a();
        for (int i3 = 0; i3 < a2; i3++) {
            this.mChildHelper.b(i3).offsetLeftAndRight(i2);
        }
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        g gVar = (g) view.getLayoutParams();
        Rect rect2 = gVar.d;
        rect.set((view.getLeft() - rect2.left) - gVar.leftMargin, (view.getTop() - rect2.top) - gVar.topMargin, view.getRight() + rect2.right + gVar.rightMargin, view.getBottom() + rect2.bottom + gVar.bottomMargin);
    }

    Rect getItemDecorInsetsForChild(View view) {
        g gVar = (g) view.getLayoutParams();
        if (!gVar.e) {
            return gVar.d;
        }
        if (this.mState.g && (gVar.c.isUpdated() || gVar.c.isInvalid())) {
            return gVar.d;
        }
        Rect rect = gVar.d;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i2).getItemOffsets(this.mTempRect, view, this, this.mState);
            rect.left += this.mTempRect.left;
            rect.top += this.mTempRect.top;
            rect.right += this.mTempRect.right;
            rect.bottom += this.mTempRect.bottom;
        }
        gVar.e = false;
        return rect;
    }

    void dispatchOnScrolled(int i2, int i3) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        onScrolled(i2, i3);
        if (this.mScrollListener != null) {
            this.mScrollListener.onScrolled(this, i2, i3);
        }
        if (this.mScrollListeners != null) {
            for (int size = this.mScrollListeners.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i2, i3);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchOnScrollStateChanged(int i2) {
        if (this.mLayout != null) {
            this.mLayout.onScrollStateChanged(i2);
        }
        onScrollStateChanged(i2);
        if (this.mScrollListener != null) {
            this.mScrollListener.onScrollStateChanged(this, i2);
        }
        if (this.mScrollListeners != null) {
            for (int size = this.mScrollListeners.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i2);
            }
        }
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.d();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class r implements Runnable {
        int a;
        int b;
        OverScroller c;
        Interpolator d = RecyclerView.sQuinticInterpolator;
        private boolean f = false;
        private boolean g = false;

        r() {
            this.c = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x012f, code lost:
            if (r8 > 0) goto L48;
         */
        /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0142 A[ADDED_TO_REGION] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 504
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.r.run():void");
        }

        final void a() {
            if (this.f) {
                this.g = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            ViewCompat.postOnAnimation(RecyclerView.this, this);
        }

        public final void a(int i, int i2) {
            b(i, i2, 0, 0);
        }

        private void b(int i, int i2, int i3, int i4) {
            a(i, i2, a(i, i2, 0, 0));
        }

        private static float a(float f) {
            return (float) Math.sin((f - 0.5f) * 0.47123894f);
        }

        int a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
            int sqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            int width = z ? RecyclerView.this.getWidth() : RecyclerView.this.getHeight();
            int i6 = width / 2;
            float f = width;
            float f2 = i6;
            float a = f2 + (a(Math.min(1.0f, (sqrt2 * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(a / sqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((abs / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        public final void a(int i, int i2, int i3) {
            a(i, i2, i3, RecyclerView.sQuinticInterpolator);
        }

        public final void a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.d != interpolator) {
                this.d = interpolator;
                this.c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.b = 0;
            this.a = 0;
            this.c.startScroll(0, 0, i, i2, i3);
            if (Build.VERSION.SDK_INT < 23) {
                this.c.computeScrollOffset();
            }
            a();
        }

        public final void b() {
            RecyclerView.this.removeCallbacks(this);
            this.c.abortAnimation();
        }
    }

    void repositionShadowingViews() {
        int a2 = this.mChildHelper.a();
        for (int i2 = 0; i2 < a2; i2++) {
            View b2 = this.mChildHelper.b(i2);
            s childViewHolder = getChildViewHolder(b2);
            if (childViewHolder != null && childViewHolder.mShadowingHolder != null) {
                View view = childViewHolder.mShadowingHolder.itemView;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class o extends c {
        o() {
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView.this.mState.f = true;
            RecyclerView.this.setDataSetChangedAfterLayout();
            if (RecyclerView.this.mAdapterHelper.d()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
            if (r0.a.size() == 1) goto L5;
         */
        @Override // android.support.v7.widget.RecyclerView.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onItemRangeChanged(int r5, int r6, java.lang.Object r7) {
            /*
                r4 = this;
                android.support.v7.widget.RecyclerView r0 = android.support.v7.widget.RecyclerView.this
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                android.support.v7.widget.RecyclerView r0 = android.support.v7.widget.RecyclerView.this
                android.support.v7.widget.d r0 = r0.mAdapterHelper
                r1 = 1
                if (r6 > 0) goto Le
                goto L26
            Le:
                java.util.ArrayList<android.support.v7.widget.d$b> r2 = r0.a
                r3 = 4
                android.support.v7.widget.d$b r5 = r0.a(r3, r5, r6, r7)
                r2.add(r5)
                int r5 = r0.g
                r5 = r5 | r3
                r0.g = r5
                java.util.ArrayList<android.support.v7.widget.d$b> r5 = r0.a
                int r5 = r5.size()
                if (r5 != r1) goto L26
                goto L27
            L26:
                r1 = 0
            L27:
                if (r1 == 0) goto L2c
                r4.a()
            L2c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.o.onItemRangeChanged(int, int, java.lang.Object):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
            if (r0.a.size() == 1) goto L5;
         */
        @Override // android.support.v7.widget.RecyclerView.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onItemRangeInserted(int r5, int r6) {
            /*
                r4 = this;
                android.support.v7.widget.RecyclerView r0 = android.support.v7.widget.RecyclerView.this
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                android.support.v7.widget.RecyclerView r0 = android.support.v7.widget.RecyclerView.this
                android.support.v7.widget.d r0 = r0.mAdapterHelper
                r2 = 1
                if (r6 > 0) goto Le
                goto L25
            Le:
                java.util.ArrayList<android.support.v7.widget.d$b> r3 = r0.a
                android.support.v7.widget.d$b r5 = r0.a(r2, r5, r6, r1)
                r3.add(r5)
                int r5 = r0.g
                r5 = r5 | r2
                r0.g = r5
                java.util.ArrayList<android.support.v7.widget.d$b> r5 = r0.a
                int r5 = r5.size()
                if (r5 != r2) goto L25
                goto L26
            L25:
                r2 = 0
            L26:
                if (r2 == 0) goto L2b
                r4.a()
            L2b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.o.onItemRangeInserted(int, int):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
            if (r0.a.size() == 1) goto L5;
         */
        @Override // android.support.v7.widget.RecyclerView.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onItemRangeRemoved(int r6, int r7) {
            /*
                r5 = this;
                android.support.v7.widget.RecyclerView r0 = android.support.v7.widget.RecyclerView.this
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                android.support.v7.widget.RecyclerView r0 = android.support.v7.widget.RecyclerView.this
                android.support.v7.widget.d r0 = r0.mAdapterHelper
                r2 = 1
                if (r7 > 0) goto Le
                goto L26
            Le:
                java.util.ArrayList<android.support.v7.widget.d$b> r3 = r0.a
                r4 = 2
                android.support.v7.widget.d$b r6 = r0.a(r4, r6, r7, r1)
                r3.add(r6)
                int r6 = r0.g
                r6 = r6 | r4
                r0.g = r6
                java.util.ArrayList<android.support.v7.widget.d$b> r6 = r0.a
                int r6 = r6.size()
                if (r6 != r2) goto L26
                goto L27
            L26:
                r2 = 0
            L27:
                if (r2 == 0) goto L2c
                r5.a()
            L2c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.o.onItemRangeRemoved(int, int):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
            if (r0.a.size() == 1) goto L6;
         */
        @Override // android.support.v7.widget.RecyclerView.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onItemRangeMoved(int r5, int r6, int r7) {
            /*
                r4 = this;
                android.support.v7.widget.RecyclerView r0 = android.support.v7.widget.RecyclerView.this
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                android.support.v7.widget.RecyclerView r0 = android.support.v7.widget.RecyclerView.this
                android.support.v7.widget.d r0 = r0.mAdapterHelper
                r2 = 1
                if (r5 == r6) goto L30
                if (r7 != r2) goto L28
                java.util.ArrayList<android.support.v7.widget.d$b> r7 = r0.a
                r3 = 8
                android.support.v7.widget.d$b r5 = r0.a(r3, r5, r6, r1)
                r7.add(r5)
                int r5 = r0.g
                r5 = r5 | r3
                r0.g = r5
                java.util.ArrayList<android.support.v7.widget.d$b> r5 = r0.a
                int r5 = r5.size()
                if (r5 != r2) goto L30
                goto L31
            L28:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "Moving more than 1 item is not supported yet"
                r5.<init>(r6)
                throw r5
            L30:
                r2 = 0
            L31:
                if (r2 == 0) goto L36
                r4.a()
            L36:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.o.onItemRangeMoved(int, int, int):void");
        }

        private void a() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION && RecyclerView.this.mHasFixedSize && RecyclerView.this.mIsAttached) {
                ViewCompat.postOnAnimation(RecyclerView.this, RecyclerView.this.mUpdateChildViewsRunnable);
                return;
            }
            RecyclerView.this.mAdapterUpdateDuringMeasure = true;
            RecyclerView.this.requestLayout();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class l {
        SparseArray<a> a = new SparseArray<>();
        int b = 0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public static class a {
            ArrayList<s> a = new ArrayList<>();
            int b = 5;
            long c = 0;
            long d = 0;

            a() {
            }
        }

        public final void a(int i, int i2) {
            a b = b(i);
            b.b = i2;
            ArrayList<s> arrayList = b.a;
            if (arrayList != null) {
                while (arrayList.size() > i2) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }

        public final s a(int i) {
            a aVar = this.a.get(i);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList<s> arrayList = aVar.a;
            return arrayList.remove(arrayList.size() - 1);
        }

        public final void a(s sVar) {
            int itemViewType = sVar.getItemViewType();
            ArrayList<s> arrayList = b(itemViewType).a;
            if (this.a.get(itemViewType).b <= arrayList.size()) {
                return;
            }
            sVar.resetInternal();
            arrayList.add(sVar);
        }

        static long a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        final void a(int i, long j) {
            a b = b(i);
            b.c = a(b.c, j);
        }

        final boolean a(int i, long j, long j2) {
            long j3 = b(i).c;
            return j3 == 0 || j + j3 < j2;
        }

        final void a(a aVar) {
            this.b++;
        }

        final void a() {
            this.b--;
        }

        a b(int i) {
            a aVar = this.a.get(i);
            if (aVar == null) {
                a aVar2 = new a();
                this.a.put(i, aVar2);
                return aVar2;
            }
            return aVar;
        }
    }

    @Nullable
    static RecyclerView findNestedRecyclerView(@NonNull View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i2));
                if (findNestedRecyclerView != null) {
                    return findNestedRecyclerView;
                }
            }
            return null;
        }
        return null;
    }

    static void clearNestedRecyclerViewIfNotNested(@NonNull s sVar) {
        if (sVar.mNestedRecyclerView != null) {
            RecyclerView recyclerView = sVar.mNestedRecyclerView.get();
            while (recyclerView != null) {
                if (recyclerView == sVar.itemView) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            sVar.mNestedRecyclerView = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public final class m {
        final ArrayList<s> a = new ArrayList<>();
        ArrayList<s> b = null;
        final ArrayList<s> c = new ArrayList<>();
        public final List<s> d = Collections.unmodifiableList(this.a);
        int e = 2;
        int f = 2;
        l g;
        q h;

        public m() {
        }

        public final void a() {
            this.a.clear();
            c();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void b() {
            this.f = this.e + (RecyclerView.this.mLayout != null ? RecyclerView.this.mLayout.mPrefetchMaxCountObserved : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
                c(size);
            }
        }

        private boolean c(s sVar) {
            if (!sVar.isRemoved()) {
                if (sVar.mPosition < 0 || sVar.mPosition >= RecyclerView.this.mAdapter.getItemCount()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + sVar + RecyclerView.this.exceptionLabel());
                } else if (RecyclerView.this.mState.g || RecyclerView.this.mAdapter.getItemViewType(sVar.mPosition) == sVar.getItemViewType()) {
                    return !RecyclerView.this.mAdapter.hasStableIds() || sVar.getItemId() == RecyclerView.this.mAdapter.getItemId(sVar.mPosition);
                } else {
                    return false;
                }
            }
            return RecyclerView.this.mState.g;
        }

        private boolean a(s sVar, int i, int i2, long j) {
            sVar.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = sVar.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != RecyclerView.FOREVER_NS) {
                long j2 = this.g.b(itemViewType).d;
                if (!(j2 == 0 || j2 + nanoTime < j)) {
                    return false;
                }
            }
            RecyclerView.this.mAdapter.bindViewHolder(sVar, i);
            long nanoTime2 = RecyclerView.this.getNanoTime();
            l.a b = this.g.b(sVar.getItemViewType());
            b.d = l.a(b.d, nanoTime2 - nanoTime);
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = sVar.itemView;
                if (ViewCompat.getImportantForAccessibility(view) == 0) {
                    ViewCompat.setImportantForAccessibility(view, 1);
                }
                if (!ViewCompat.hasAccessibilityDelegate(view)) {
                    sVar.addFlags(16384);
                    ViewCompat.setAccessibilityDelegate(view, RecyclerView.this.mAccessibilityDelegate.b);
                }
            }
            if (RecyclerView.this.mState.g) {
                sVar.mPreLayoutPosition = i2;
            }
            return true;
        }

        public final int a(int i) {
            if (i >= 0 && i < RecyclerView.this.mState.c()) {
                return !RecyclerView.this.mState.g ? i : RecyclerView.this.mAdapterHelper.b(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.mState.c() + RecyclerView.this.exceptionLabel());
        }

        public final View b(int i) {
            return a(i, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final View a(int i, boolean z) {
            return a(i, false, RecyclerView.FOREVER_NS).itemView;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0220 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x019a  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01cc  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01f6  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0204  */
        @android.support.annotation.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.support.v7.widget.RecyclerView.s a(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 604
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.m.a(int, boolean, long):android.support.v7.widget.RecyclerView$s");
        }

        private void d(s sVar) {
            if (sVar.itemView instanceof ViewGroup) {
                a((ViewGroup) sVar.itemView, false);
            }
        }

        private void a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public final void a(View view) {
            s childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            a(childViewHolderInt);
        }

        final void c() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                c(size);
            }
            this.c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.a();
            }
        }

        final void c(int i) {
            a(this.c.get(i), true);
            this.c.remove(i);
        }

        final void a(s sVar) {
            boolean z;
            if (sVar.isScrap() || sVar.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(sVar.isScrap());
                sb.append(" isAttached:");
                sb.append(sVar.itemView.getParent() != null);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            } else if (sVar.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + sVar + RecyclerView.this.exceptionLabel());
            } else if (sVar.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            } else {
                boolean doesTransientStatePreventRecycling = sVar.doesTransientStatePreventRecycling();
                if ((RecyclerView.this.mAdapter != null && doesTransientStatePreventRecycling && RecyclerView.this.mAdapter.onFailedToRecycleView(sVar)) || sVar.isRecyclable()) {
                    if (this.f <= 0 || sVar.hasAnyOfTheFlags(526)) {
                        z = false;
                    } else {
                        int size = this.c.size();
                        if (size >= this.f && size > 0) {
                            c(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.a(sVar.mPosition)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.mPrefetchRegistry.a(this.c.get(i).mPosition)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.c.add(size, sVar);
                        z = true;
                    }
                    if (!z) {
                        a(sVar, true);
                        r1 = true;
                    }
                } else {
                    z = false;
                }
                RecyclerView.this.mViewInfoStore.d(sVar);
                if (z || r1 || !doesTransientStatePreventRecycling) {
                    return;
                }
                sVar.mOwnerRecyclerView = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(s sVar, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(sVar);
            if (sVar.hasAnyOfTheFlags(16384)) {
                sVar.setFlags(0, 16384);
                ViewCompat.setAccessibilityDelegate(sVar.itemView, null);
            }
            if (z) {
                e(sVar);
            }
            sVar.mOwnerRecyclerView = null;
            d().a(sVar);
        }

        final void b(View view) {
            s childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            a(childViewHolderInt);
        }

        final void c(View view) {
            s childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.hasAnyOfTheFlags(12) || !childViewHolderInt.isUpdated() || RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !RecyclerView.this.mAdapter.hasStableIds()) {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.setScrapContainer(this, false);
                this.a.add(childViewHolderInt);
                return;
            }
            if (this.b == null) {
                this.b = new ArrayList<>();
            }
            childViewHolderInt.setScrapContainer(this, true);
            this.b.add(childViewHolderInt);
        }

        final void b(s sVar) {
            if (sVar.mInChangeScrap) {
                this.b.remove(sVar);
            } else {
                this.a.remove(sVar);
            }
            sVar.mScrapContainer = null;
            sVar.mInChangeScrap = false;
            sVar.clearReturnedFromScrapFlag();
        }

        private s d(int i) {
            int size;
            int a;
            if (this.b == null || (size = this.b.size()) == 0) {
                return null;
            }
            for (int i2 = 0; i2 < size; i2++) {
                s sVar = this.b.get(i2);
                if (!sVar.wasReturnedFromScrap() && sVar.getLayoutPosition() == i) {
                    sVar.addFlags(32);
                    return sVar;
                }
            }
            if (RecyclerView.this.mAdapter.hasStableIds() && (a = RecyclerView.this.mAdapterHelper.a(i, 0)) > 0 && a < RecyclerView.this.mAdapter.getItemCount()) {
                long itemId = RecyclerView.this.mAdapter.getItemId(a);
                for (int i3 = 0; i3 < size; i3++) {
                    s sVar2 = this.b.get(i3);
                    if (!sVar2.wasReturnedFromScrap() && sVar2.getItemId() == itemId) {
                        sVar2.addFlags(32);
                        return sVar2;
                    }
                }
            }
            return null;
        }

        private s b(int i, boolean z) {
            View view;
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                s sVar = this.a.get(i2);
                if (!sVar.wasReturnedFromScrap() && sVar.getLayoutPosition() == i && !sVar.isInvalid() && (RecyclerView.this.mState.g || !sVar.isRemoved())) {
                    sVar.addFlags(32);
                    return sVar;
                }
            }
            if (!z) {
                android.support.v7.widget.s sVar2 = RecyclerView.this.mChildHelper;
                int size2 = sVar2.c.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        view = null;
                        break;
                    }
                    view = sVar2.c.get(i3);
                    s b = sVar2.a.b(view);
                    if (b.getLayoutPosition() == i && !b.isInvalid() && !b.isRemoved()) {
                        break;
                    }
                    i3++;
                }
                if (view != null) {
                    s childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                    android.support.v7.widget.s sVar3 = RecyclerView.this.mChildHelper;
                    int a = sVar3.a.a(view);
                    if (a < 0) {
                        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                    } else if (!sVar3.b.c(a)) {
                        throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                    } else {
                        sVar3.b.b(a);
                        sVar3.b(view);
                        int c = RecyclerView.this.mChildHelper.c(view);
                        if (c == -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
                        }
                        RecyclerView.this.mChildHelper.d(c);
                        c(view);
                        childViewHolderInt.addFlags(8224);
                        return childViewHolderInt;
                    }
                }
            }
            int size3 = this.c.size();
            for (int i4 = 0; i4 < size3; i4++) {
                s sVar4 = this.c.get(i4);
                if (!sVar4.isInvalid() && sVar4.getLayoutPosition() == i) {
                    if (!z) {
                        this.c.remove(i4);
                    }
                    return sVar4;
                }
            }
            return null;
        }

        private s a(long j, int i, boolean z) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                s sVar = this.a.get(size);
                if (sVar.getItemId() == j && !sVar.wasReturnedFromScrap()) {
                    if (i == sVar.getItemViewType()) {
                        sVar.addFlags(32);
                        if (sVar.isRemoved() && !RecyclerView.this.mState.g) {
                            sVar.setFlags(2, 14);
                        }
                        return sVar;
                    } else if (!z) {
                        this.a.remove(size);
                        RecyclerView.this.removeDetachedView(sVar.itemView, false);
                        b(sVar.itemView);
                    }
                }
            }
            int size2 = this.c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                s sVar2 = this.c.get(size2);
                if (sVar2.getItemId() == j) {
                    if (i == sVar2.getItemViewType()) {
                        if (!z) {
                            this.c.remove(size2);
                        }
                        return sVar2;
                    } else if (!z) {
                        c(size2);
                        return null;
                    }
                }
            }
        }

        private void e(s sVar) {
            if (RecyclerView.this.mAdapter != null) {
                RecyclerView.this.mAdapter.onViewRecycled(sVar);
            }
            if (RecyclerView.this.mState != null) {
                RecyclerView.this.mViewInfoStore.d(sVar);
            }
        }

        final l d() {
            if (this.g == null) {
                this.g = new l();
            }
            return this.g;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class a<VH extends s> {
        private final b mObservable = new b();
        private boolean mHasStableIds = false;

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            TraceCompat.beginSection(RecyclerView.TRACE_CREATE_VIEW_TAG);
            VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
            onCreateViewHolder.mItemViewType = i;
            TraceCompat.endSection();
            return onCreateViewHolder;
        }

        public final void bindViewHolder(VH vh, int i) {
            vh.mPosition = i;
            if (hasStableIds()) {
                vh.mItemId = getItemId(i);
            }
            vh.setFlags(1, 519);
            TraceCompat.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof g) {
                ((g) layoutParams).e = true;
            }
            TraceCompat.endSection();
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public void registerAdapterDataObserver(c cVar) {
            this.mObservable.registerObserver(cVar);
        }

        public void unregisterAdapterDataObserver(c cVar) {
            this.mObservable.unregisterObserver(cVar);
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.a(i, 1);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.a(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.a(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.a(i, i2, obj);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.b(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.d(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.b(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.c(i, 1);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.c(i, i2);
        }
    }

    void dispatchChildDetached(View view) {
        s childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        if (this.mAdapter != null && childViewHolderInt != null) {
            this.mAdapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        if (this.mOnChildAttachStateListeners != null) {
            for (int size = this.mOnChildAttachStateListeners.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewDetachedFromWindow(view);
            }
        }
    }

    void dispatchChildAttached(View view) {
        s childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        if (this.mAdapter != null && childViewHolderInt != null) {
            this.mAdapter.onViewAttachedToWindow(childViewHolderInt);
        }
        if (this.mOnChildAttachStateListeners != null) {
            for (int size = this.mOnChildAttachStateListeners.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewAttachedToWindow(view);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class LayoutManager {
        android.support.v7.widget.s mChildHelper;
        private int mHeight;
        private int mHeightMode;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        @Nullable
        p mSmoothScroller;
        private int mWidth;
        private int mWidthMode;
        private final ViewBoundsCheck.b mHorizontalBoundCheckCallback = new ViewBoundsCheck.b() { // from class: android.support.v7.widget.RecyclerView.LayoutManager.1
            @Override // android.support.v7.widget.ViewBoundsCheck.b
            public final View a(int i) {
                return LayoutManager.this.getChildAt(i);
            }

            @Override // android.support.v7.widget.ViewBoundsCheck.b
            public final int a() {
                return LayoutManager.this.getPaddingLeft();
            }

            @Override // android.support.v7.widget.ViewBoundsCheck.b
            public final int b() {
                return LayoutManager.this.getWidth() - LayoutManager.this.getPaddingRight();
            }

            @Override // android.support.v7.widget.ViewBoundsCheck.b
            public final int a(View view) {
                return LayoutManager.this.getDecoratedLeft(view) - ((g) view.getLayoutParams()).leftMargin;
            }

            @Override // android.support.v7.widget.ViewBoundsCheck.b
            public final int b(View view) {
                return LayoutManager.this.getDecoratedRight(view) + ((g) view.getLayoutParams()).rightMargin;
            }
        };
        private final ViewBoundsCheck.b mVerticalBoundCheckCallback = new ViewBoundsCheck.b() { // from class: android.support.v7.widget.RecyclerView.LayoutManager.2
            @Override // android.support.v7.widget.ViewBoundsCheck.b
            public final View a(int i) {
                return LayoutManager.this.getChildAt(i);
            }

            @Override // android.support.v7.widget.ViewBoundsCheck.b
            public final int a() {
                return LayoutManager.this.getPaddingTop();
            }

            @Override // android.support.v7.widget.ViewBoundsCheck.b
            public final int b() {
                return LayoutManager.this.getHeight() - LayoutManager.this.getPaddingBottom();
            }

            @Override // android.support.v7.widget.ViewBoundsCheck.b
            public final int a(View view) {
                return LayoutManager.this.getDecoratedTop(view) - ((g) view.getLayoutParams()).topMargin;
            }

            @Override // android.support.v7.widget.ViewBoundsCheck.b
            public final int b(View view) {
                return LayoutManager.this.getDecoratedBottom(view) + ((g) view.getLayoutParams()).bottomMargin;
            }
        };
        ViewBoundsCheck mHorizontalBoundCheck = new ViewBoundsCheck(this.mHorizontalBoundCheckCallback);
        ViewBoundsCheck mVerticalBoundCheck = new ViewBoundsCheck(this.mVerticalBoundCheckCallback);
        boolean mRequestedSimpleAnimations = false;
        boolean mIsAttachedToWindow = false;
        boolean mAutoMeasure = false;
        private boolean mMeasurementCacheEnabled = true;
        private boolean mItemPrefetchEnabled = true;

        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public static class Properties {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public interface a {
            void a(int i, int i2);
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(g gVar) {
            return gVar != null;
        }

        public void collectAdjacentPrefetchPositions(int i, int i2, State state, a aVar) {
        }

        public void collectInitialPrefetchPositions(int i, a aVar) {
        }

        public int computeHorizontalScrollExtent(State state) {
            return 0;
        }

        public int computeHorizontalScrollOffset(State state) {
            return 0;
        }

        public int computeHorizontalScrollRange(State state) {
            return 0;
        }

        public int computeVerticalScrollExtent(State state) {
            return 0;
        }

        public int computeVerticalScrollOffset(State state) {
            return 0;
        }

        public int computeVerticalScrollRange(State state) {
            return 0;
        }

        public abstract g generateDefaultLayoutParams();

        public int getBaseline() {
            return -1;
        }

        public int getSelectionModeForAccessibility(m mVar, State state) {
            return 0;
        }

        public boolean isLayoutHierarchical(m mVar, State state) {
            return false;
        }

        public void onAdapterChanged(a aVar, a aVar2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        @CallSuper
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        @Nullable
        public View onFocusSearchFailed(View view, int i, m mVar, State state) {
            return null;
        }

        public View onInterceptFocusSearch(View view, int i) {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        }

        public void onLayoutCompleted(State state) {
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        public boolean performAccessibilityActionForItem(m mVar, State state, View view, int i, Bundle bundle) {
            return false;
        }

        public int scrollHorizontallyBy(int i, m mVar, State state) {
            return 0;
        }

        public void scrollToPosition(int i) {
        }

        public int scrollVerticallyBy(int i, m mVar, State state) {
            return 0;
        }

        boolean shouldMeasureTwice() {
            return false;
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        void setMeasureSpecs(int i, int i2) {
            this.mWidth = View.MeasureSpec.getSize(i);
            this.mWidthMode = View.MeasureSpec.getMode(i);
            if (this.mWidthMode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i2);
            this.mHeightMode = View.MeasureSpec.getMode(i2);
            if (this.mHeightMode != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                if (rect.left < i3) {
                    i3 = rect.left;
                }
                if (rect.right > i5) {
                    i5 = rect.right;
                }
                if (rect.top < i4) {
                    i4 = rect.top;
                }
                if (rect.bottom > i6) {
                    i6 = rect.bottom;
                }
            }
            this.mRecyclerView.mTempRect.set(i3, i4, i5, i6);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i2, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        public void requestLayout() {
            if (this.mRecyclerView != null) {
                this.mRecyclerView.requestLayout();
            }
        }

        public void assertInLayoutOrScroll(String str) {
            if (this.mRecyclerView != null) {
                this.mRecyclerView.assertInLayoutOrScroll(str);
            }
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        public void assertNotInLayoutOrScroll(String str) {
            if (this.mRecyclerView != null) {
                this.mRecyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                if (this.mRecyclerView != null) {
                    this.mRecyclerView.mRecycler.b();
                }
            }
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        void dispatchDetachedFromWindow(RecyclerView recyclerView, m mVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, mVar);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public void postOnAnimation(Runnable runnable) {
            if (this.mRecyclerView != null) {
                ViewCompat.postOnAnimation(this.mRecyclerView, runnable);
            }
        }

        public boolean removeCallbacks(Runnable runnable) {
            if (this.mRecyclerView != null) {
                return this.mRecyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        @CallSuper
        public void onDetachedFromWindow(RecyclerView recyclerView, m mVar) {
            onDetachedFromWindow(recyclerView);
        }

        public boolean getClipToPadding() {
            return this.mRecyclerView != null && this.mRecyclerView.mClipToPadding;
        }

        public void onLayoutChildren(m mVar, State state) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof g) {
                return new g((g) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new g((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new g(layoutParams);
        }

        public g generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new g(context, attributeSet);
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(p pVar) {
            if (this.mSmoothScroller != null && pVar != this.mSmoothScroller && this.mSmoothScroller.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = pVar;
            this.mSmoothScroller.start(this.mRecyclerView, this);
        }

        public boolean isSmoothScrolling() {
            return this.mSmoothScroller != null && this.mSmoothScroller.isRunning();
        }

        public int getLayoutDirection() {
            return ViewCompat.getLayoutDirection(this.mRecyclerView);
        }

        public void endAnimation(View view) {
            if (this.mRecyclerView.mItemAnimator != null) {
                this.mRecyclerView.mItemAnimator.endAnimation(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addDisappearingView(View view, int i) {
            addViewInt(view, i, true);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void addView(View view, int i) {
            addViewInt(view, i, false);
        }

        private void addViewInt(View view, int i, boolean z) {
            s childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            }
            g gVar = (g) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int c = this.mChildHelper.c(view);
                if (i == -1) {
                    i = this.mChildHelper.a();
                }
                if (c == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
                } else if (c != i) {
                    this.mRecyclerView.mLayout.moveView(c, i);
                }
            } else {
                this.mChildHelper.a(view, i, false);
                gVar.e = true;
                if (this.mSmoothScroller != null && this.mSmoothScroller.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (gVar.f) {
                childViewHolderInt.itemView.invalidate();
                gVar.f = false;
            }
        }

        public void removeView(View view) {
            android.support.v7.widget.s sVar = this.mChildHelper;
            int a2 = sVar.a.a(view);
            if (a2 >= 0) {
                if (sVar.b.d(a2)) {
                    sVar.b(view);
                }
                sVar.a.a(a2);
            }
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.mChildHelper.a(i);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.a(childCount);
            }
        }

        public int getPosition(View view) {
            return ((g) view.getLayoutParams()).c.getLayoutPosition();
        }

        public int getItemViewType(View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        @Nullable
        public View findContainingItemView(View view) {
            View findContainingItemView;
            if (this.mRecyclerView == null || (findContainingItemView = this.mRecyclerView.findContainingItemView(view)) == null || this.mChildHelper.d(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                s childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.g || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public void detachView(View view) {
            int c = this.mChildHelper.c(view);
            if (c >= 0) {
                detachViewInternal(c, view);
            }
        }

        public void detachViewAt(int i) {
            detachViewInternal(i, getChildAt(i));
        }

        private void detachViewInternal(int i, View view) {
            this.mChildHelper.d(i);
        }

        public void attachView(View view, int i, g gVar) {
            s childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            }
            this.mChildHelper.a(view, i, gVar, childViewHolderInt.isRemoved());
        }

        public void attachView(View view, int i) {
            attachView(view, i, (g) view.getLayoutParams());
        }

        public void attachView(View view) {
            attachView(view, -1);
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
            }
            detachViewAt(i);
            attachView(childAt, i2);
        }

        public void detachAndScrapView(View view, m mVar) {
            scrapOrRecycleView(mVar, this.mChildHelper.c(view), view);
        }

        public void detachAndScrapViewAt(int i, m mVar) {
            scrapOrRecycleView(mVar, i, getChildAt(i));
        }

        public void removeAndRecycleView(View view, m mVar) {
            removeView(view);
            mVar.a(view);
        }

        public void removeAndRecycleViewAt(int i, m mVar) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            mVar.a(childAt);
        }

        public int getChildCount() {
            if (this.mChildHelper != null) {
                return this.mChildHelper.a();
            }
            return 0;
        }

        public View getChildAt(int i) {
            if (this.mChildHelper != null) {
                return this.mChildHelper.b(i);
            }
            return null;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getPaddingLeft() {
            if (this.mRecyclerView != null) {
                return this.mRecyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingTop() {
            if (this.mRecyclerView != null) {
                return this.mRecyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPaddingRight() {
            if (this.mRecyclerView != null) {
                return this.mRecyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingBottom() {
            if (this.mRecyclerView != null) {
                return this.mRecyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingStart() {
            if (this.mRecyclerView != null) {
                return ViewCompat.getPaddingStart(this.mRecyclerView);
            }
            return 0;
        }

        public int getPaddingEnd() {
            if (this.mRecyclerView != null) {
                return ViewCompat.getPaddingEnd(this.mRecyclerView);
            }
            return 0;
        }

        public boolean isFocused() {
            return this.mRecyclerView != null && this.mRecyclerView.isFocused();
        }

        public boolean hasFocus() {
            return this.mRecyclerView != null && this.mRecyclerView.hasFocus();
        }

        public View getFocusedChild() {
            View focusedChild;
            if (this.mRecyclerView == null || (focusedChild = this.mRecyclerView.getFocusedChild()) == null || this.mChildHelper.d(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getItemCount() {
            a adapter = this.mRecyclerView != null ? this.mRecyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public void offsetChildrenHorizontal(int i) {
            if (this.mRecyclerView != null) {
                this.mRecyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(int i) {
            if (this.mRecyclerView != null) {
                this.mRecyclerView.offsetChildrenVertical(i);
            }
        }

        public void ignoreView(View view) {
            if (view.getParent() != this.mRecyclerView || this.mRecyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
            }
            s childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.d(childViewHolderInt);
        }

        public void stopIgnoringView(View view) {
            s childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void detachAndScrapAttachedViews(m mVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(mVar, childCount, getChildAt(childCount));
            }
        }

        private void scrapOrRecycleView(m mVar, int i, View view) {
            s childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i);
                mVar.a(childViewHolderInt);
                return;
            }
            detachViewAt(i);
            mVar.c(view);
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }

        public void measureChild(View view, int i, int i2) {
            g gVar = (g) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i3, gVar.width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i4, gVar.height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, gVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean shouldReMeasureChild(View view, int i, int i2, g gVar) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i, gVar.width) && isMeasurementUpToDate(view.getMeasuredHeight(), i2, gVar.height)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean shouldMeasureChild(View view, int i, int i2, g gVar) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i, gVar.width) && isMeasurementUpToDate(view.getHeight(), i2, gVar.height)) ? false : true;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 <= 0 || i == i3) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i;
                } else {
                    return true;
                }
            }
            return false;
        }

        public void measureChildWithMargins(View view, int i, int i2) {
            g gVar = (g) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + gVar.leftMargin + gVar.rightMargin + i3, gVar.width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + gVar.topMargin + gVar.bottomMargin + i4, gVar.height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, gVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
            if (r3 >= 0) goto L4;
         */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L12
                if (r3 < 0) goto L10
            Lc:
                r1 = r3
            Ld:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L1e
            L10:
                r1 = 0
                goto L1e
            L12:
                if (r3 < 0) goto L15
                goto Lc
            L15:
                r4 = -1
                if (r3 != r4) goto L19
                goto Ld
            L19:
                r4 = -2
                if (r3 != r4) goto L10
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
            L1e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.LayoutManager.getChildMeasureSpec(int, int, int, boolean):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
            if (r5 == 1073741824) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1c
                if (r7 < 0) goto L13
            L10:
                r6 = 1073741824(0x40000000, float:2.0)
                goto L2f
            L13:
                if (r7 != r1) goto L2e
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2e
                if (r5 == r3) goto L21
                goto L2e
            L1c:
                if (r7 < 0) goto L1f
                goto L10
            L1f:
                if (r7 != r1) goto L24
            L21:
                r7 = r4
                r6 = r5
                goto L2f
            L24:
                if (r7 != r0) goto L2e
                if (r5 == r2) goto L2a
                if (r5 != r3) goto L2c
            L2a:
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
            L2c:
                r7 = r4
                goto L2f
            L2e:
                r7 = 0
            L2f:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.LayoutManager.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((g) view.getLayoutParams()).d;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((g) view.getLayoutParams()).d;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((g) view.getLayoutParams()).d;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            g gVar = (g) view.getLayoutParams();
            Rect rect = gVar.d;
            view.layout(i + rect.left + gVar.leftMargin, i2 + rect.top + gVar.topMargin, (i3 - rect.right) - gVar.rightMargin, (i4 - rect.bottom) - gVar.bottomMargin);
        }

        public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((g) view.getLayoutParams()).d;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public int getDecoratedRight(View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedBottom(View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            if (this.mRecyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(this.mRecyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public int getTopDecorationHeight(View view) {
            return ((g) view.getLayoutParams()).d.top;
        }

        public int getBottomDecorationHeight(View view) {
            return ((g) view.getLayoutParams()).d.bottom;
        }

        public int getLeftDecorationWidth(View view) {
            return ((g) view.getLayoutParams()).d.left;
        }

        public int getRightDecorationWidth(View view) {
            return ((g) view.getLayoutParams()).d.right;
        }

        private int[] getChildRectangleOnScreenScrollAmount(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width2 - width;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(recyclerView, view, rect, z);
            int i = childRectangleOnScreenScrollAmount[0];
            int i2 = childRectangleOnScreenScrollAmount[1];
            if ((!z2 || isFocusedChildVisibleAfterScrolling(recyclerView, i, i2)) && !(i == 0 && i2 == 0)) {
                if (z) {
                    recyclerView.scrollBy(i, i2);
                } else {
                    recyclerView.smoothScrollBy(i, i2);
                }
                return true;
            }
            return false;
        }

        public boolean isViewPartiallyVisible(@NonNull View view, boolean z, boolean z2) {
            boolean z3 = this.mHorizontalBoundCheck.a(view, 24579) && this.mVerticalBoundCheck.a(view, 24579);
            return z ? z3 : !z3;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i < width && rect.right - i > paddingLeft && rect.top - i2 < height && rect.bottom - i2 > paddingTop;
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, State state, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public void onMeasure(m mVar, State state, int i, int i2) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        public int getMinimumWidth() {
            return ViewCompat.getMinimumWidth(this.mRecyclerView);
        }

        public int getMinimumHeight() {
            return ViewCompat.getMinimumHeight(this.mRecyclerView);
        }

        void stopSmoothScroller() {
            if (this.mSmoothScroller != null) {
                this.mSmoothScroller.stop();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onSmoothScrollerStopped(p pVar) {
            if (this.mSmoothScroller == pVar) {
                this.mSmoothScroller = null;
            }
        }

        public void removeAndRecycleAllViews(m mVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, mVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            onInitializeAccessibilityNodeInfo(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, accessibilityNodeInfoCompat);
        }

        public void onInitializeAccessibilityNodeInfo(m mVar, State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCountForAccessibility(mVar, state), getColumnCountForAccessibility(mVar, state), isLayoutHierarchical(mVar, state), getSelectionModeForAccessibility(mVar, state)));
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            onInitializeAccessibilityEvent(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityEvent(m mVar, State state, AccessibilityEvent accessibilityEvent) {
            if (this.mRecyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!this.mRecyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            if (this.mRecyclerView.mAdapter != null) {
                accessibilityEvent.setItemCount(this.mRecyclerView.mAdapter.getItemCount());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void onInitializeAccessibilityNodeInfoForItem(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            s childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.d(childViewHolderInt.itemView)) {
                return;
            }
            onInitializeAccessibilityNodeInfoForItem(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, view, accessibilityNodeInfoCompat);
        }

        public void onInitializeAccessibilityNodeInfoForItem(m mVar, State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false, false));
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int getRowCountForAccessibility(m mVar, State state) {
            if (this.mRecyclerView == null || this.mRecyclerView.mAdapter == null || !canScrollVertically()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getColumnCountForAccessibility(m mVar, State state) {
            if (this.mRecyclerView == null || this.mRecyclerView.mAdapter == null || !canScrollHorizontally()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean performAccessibilityAction(int i, Bundle bundle) {
            return performAccessibilityAction(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, i, bundle);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean performAccessibilityAction(android.support.v7.widget.RecyclerView.m r2, android.support.v7.widget.RecyclerView.State r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                android.support.v7.widget.RecyclerView r2 = r1.mRecyclerView
                r3 = 0
                if (r2 != 0) goto L6
                return r3
            L6:
                r2 = 4096(0x1000, float:5.74E-42)
                r5 = 1
                if (r4 == r2) goto L44
                r2 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r2) goto L12
                r2 = 0
            L10:
                r4 = 0
                goto L72
            L12:
                android.support.v7.widget.RecyclerView r2 = r1.mRecyclerView
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L2b
                int r2 = r1.getHeight()
                int r0 = r1.getPaddingTop()
                int r2 = r2 - r0
                int r0 = r1.getPaddingBottom()
                int r2 = r2 - r0
                int r2 = -r2
                goto L2c
            L2b:
                r2 = 0
            L2c:
                android.support.v7.widget.RecyclerView r0 = r1.mRecyclerView
                boolean r4 = r0.canScrollHorizontally(r4)
                if (r4 == 0) goto L10
                int r4 = r1.getWidth()
                int r0 = r1.getPaddingLeft()
                int r4 = r4 - r0
                int r0 = r1.getPaddingRight()
                int r4 = r4 - r0
                int r4 = -r4
                goto L72
            L44:
                android.support.v7.widget.RecyclerView r2 = r1.mRecyclerView
                boolean r2 = r2.canScrollVertically(r5)
                if (r2 == 0) goto L5b
                int r2 = r1.getHeight()
                int r4 = r1.getPaddingTop()
                int r2 = r2 - r4
                int r4 = r1.getPaddingBottom()
                int r2 = r2 - r4
                goto L5c
            L5b:
                r2 = 0
            L5c:
                android.support.v7.widget.RecyclerView r4 = r1.mRecyclerView
                boolean r4 = r4.canScrollHorizontally(r5)
                if (r4 == 0) goto L10
                int r4 = r1.getWidth()
                int r0 = r1.getPaddingLeft()
                int r4 = r4 - r0
                int r0 = r1.getPaddingRight()
                int r4 = r4 - r0
            L72:
                if (r2 != 0) goto L77
                if (r4 != 0) goto L77
                return r3
            L77:
                android.support.v7.widget.RecyclerView r3 = r1.mRecyclerView
                r3.scrollBy(r4, r2)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.LayoutManager.performAccessibilityAction(android.support.v7.widget.RecyclerView$m, android.support.v7.widget.RecyclerView$State, int, android.os.Bundle):boolean");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
            return performAccessibilityActionForItem(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, view, i, bundle);
        }

        public static Properties getProperties(Context context, AttributeSet attributeSet, int i, int i2) {
            Properties properties = new Properties();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16842993, R.attr.layoutManager, R.attr.spanCount, R.attr.reverseLayout, R.attr.stackFromEnd, R.attr.fastScrollEnabled, R.attr.fastScrollVerticalThumbDrawable, R.attr.fastScrollVerticalTrackDrawable, R.attr.fastScrollHorizontalThumbDrawable, R.attr.fastScrollHorizontalTrackDrawable}, i, i2);
            properties.a = obtainStyledAttributes.getInt(0, 1);
            properties.b = obtainStyledAttributes.getInt(3, 1);
            properties.c = obtainStyledAttributes.getBoolean(4, false);
            properties.d = obtainStyledAttributes.getBoolean(5, false);
            obtainStyledAttributes.recycle();
            return properties;
        }

        void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        void removeAndRecycleScrapInt(m mVar) {
            int size = mVar.a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = mVar.a.get(i).itemView;
                s childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    if (this.mRecyclerView.mItemAnimator != null) {
                        this.mRecyclerView.mItemAnimator.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    mVar.b(view);
                }
            }
            mVar.a.clear();
            if (mVar.b != null) {
                mVar.b.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class f {
        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, State state) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, State state) {
            onDrawOver(canvas, recyclerView);
        }

        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
            getItemOffsets(rect, ((g) view.getLayoutParams()).c.getLayoutPosition(), recyclerView);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class s {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_SET_A11Y_ITEM_DELEGATE = 16384;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        private int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        s mShadowedHolder = null;
        s mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        private m mScrapContainer = null;
        private boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        @VisibleForTesting
        int mPendingAccessibilityState = -1;

        public s(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((g) this.itemView.getLayoutParams()).e = true;
            }
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        @Deprecated
        public final int getPosition() {
            return this.mPreLayoutPosition == -1 ? this.mPosition : this.mPreLayoutPosition;
        }

        public final int getLayoutPosition() {
            return this.mPreLayoutPosition == -1 ? this.mPosition : this.mPreLayoutPosition;
        }

        public final int getAdapterPosition() {
            if (this.mOwnerRecyclerView == null) {
                return -1;
            }
            return this.mOwnerRecyclerView.getAdapterPositionFor(this);
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        void unScrap() {
            this.mScrapContainer.b(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        void setScrapContainer(m mVar, boolean z) {
            this.mScrapContainer = mVar;
            this.mInChangeScrap = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                this.mPayloads = new ArrayList();
                this.mUnmodifiedPayloads = Collections.unmodifiableList(this.mPayloads);
            }
        }

        void clearPayload() {
            if (this.mPayloads != null) {
                this.mPayloads.clear();
            }
            this.mFlags &= -1025;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                if (this.mPayloads == null || this.mPayloads.size() == 0) {
                    return FULLUPDATE_PAYLOADS;
                }
                return this.mUnmodifiedPayloads;
            }
            return FULLUPDATE_PAYLOADS;
        }

        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            this.mWasImportantForAccessibilityBeforeHidden = ViewCompat.getImportantForAccessibility(this.itemView);
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + CommonConstant.Symbol.BRACKET_RIGHT);
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
            return sb.toString();
        }

        public final void setIsRecyclable(boolean z) {
            this.mIsRecyclableCount = z ? this.mIsRecyclableCount - 1 : this.mIsRecyclableCount + 1;
            if (this.mIsRecyclableCount < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && this.mIsRecyclableCount == 1) {
                this.mFlags |= 16;
            } else if (z && this.mIsRecyclableCount == 0) {
                this.mFlags &= -17;
            }
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !ViewCompat.hasTransientState(this.itemView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && ViewCompat.hasTransientState(this.itemView);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }
    }

    @VisibleForTesting
    boolean setChildImportantForAccessibilityInternal(s sVar, int i2) {
        if (isComputingLayout()) {
            sVar.mPendingAccessibilityState = i2;
            this.mPendingAccessibilityImportanceChange.add(sVar);
            return false;
        }
        ViewCompat.setImportantForAccessibility(sVar.itemView, i2);
        return true;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i2;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            s sVar = this.mPendingAccessibilityImportanceChange.get(size);
            if (sVar.itemView.getParent() == this && !sVar.shouldIgnore() && (i2 = sVar.mPendingAccessibilityState) != -1) {
                ViewCompat.setImportantForAccessibility(sVar.itemView, i2);
                sVar.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x005a, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int getAdapterPositionFor(android.support.v7.widget.RecyclerView.s r8) {
        /*
            r7 = this;
            r0 = 524(0x20c, float:7.34E-43)
            boolean r0 = r8.hasAnyOfTheFlags(r0)
            r1 = -1
            if (r0 != 0) goto L5e
            boolean r0 = r8.isBound()
            if (r0 != 0) goto L10
            goto L5e
        L10:
            android.support.v7.widget.d r0 = r7.mAdapterHelper
            int r8 = r8.mPosition
            java.util.ArrayList<android.support.v7.widget.d$b> r2 = r0.a
            int r2 = r2.size()
            r3 = 0
        L1b:
            if (r3 >= r2) goto L5d
            java.util.ArrayList<android.support.v7.widget.d$b> r4 = r0.a
            java.lang.Object r4 = r4.get(r3)
            android.support.v7.widget.d$b r4 = (android.support.v7.widget.d.b) r4
            int r5 = r4.a
            r6 = 8
            if (r5 == r6) goto L47
            switch(r5) {
                case 1: goto L3f;
                case 2: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L5a
        L2f:
            int r5 = r4.b
            if (r5 > r8) goto L5a
            int r5 = r4.b
            int r6 = r4.d
            int r5 = r5 + r6
            if (r5 <= r8) goto L3b
            return r1
        L3b:
            int r4 = r4.d
            int r8 = r8 - r4
            goto L5a
        L3f:
            int r5 = r4.b
            if (r5 > r8) goto L5a
            int r4 = r4.d
            int r8 = r8 + r4
            goto L5a
        L47:
            int r5 = r4.b
            if (r5 != r8) goto L4e
            int r8 = r4.d
            goto L5a
        L4e:
            int r5 = r4.b
            if (r5 >= r8) goto L54
            int r8 = r8 + (-1)
        L54:
            int r4 = r4.d
            if (r4 > r8) goto L5a
            int r8 = r8 + 1
        L5a:
            int r3 = r3 + 1
            goto L1b
        L5d:
            return r8
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.getAdapterPositionFor(android.support.v7.widget.RecyclerView$s):int");
    }

    @VisibleForTesting
    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new FastScroller(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().setNestedScrollingEnabled(z);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().isNestedScrollingEnabled();
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().startNestedScroll(i2);
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean startNestedScroll(int i2, int i3) {
        return getScrollingChildHelper().startNestedScroll(i2, i3);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public void stopNestedScroll() {
        getScrollingChildHelper().stopNestedScroll();
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public void stopNestedScroll(int i2) {
        getScrollingChildHelper().stopNestedScroll(i2);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().hasNestedScrollingParent();
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i2) {
        return getScrollingChildHelper().hasNestedScrollingParent(i2);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().dispatchNestedScroll(i2, i3, i4, i5, iArr);
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().dispatchNestedScroll(i2, i3, i4, i5, iArr, i6);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i2, i3, iArr, iArr2);
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i2, i3, iArr, iArr2, i4);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return getScrollingChildHelper().dispatchNestedFling(f2, f3, z);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().dispatchNestedPreFling(f2, f3);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class g extends ViewGroup.MarginLayoutParams {
        public s c;
        final Rect d;
        boolean e;
        boolean f;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.d = new Rect();
            this.e = true;
            this.f = false;
        }

        public g(int i, int i2) {
            super(i, i2);
            this.d = new Rect();
            this.e = true;
            this.f = false;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.d = new Rect();
            this.e = true;
            this.f = false;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.d = new Rect();
            this.e = true;
            this.f = false;
        }

        public g(g gVar) {
            super((ViewGroup.LayoutParams) gVar);
            this.d = new Rect();
            this.e = true;
            this.f = false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class c {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i, int i2) {
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            onItemRangeChanged(i, i2);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class p {
        private LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a(0, 0);

        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public interface b {
            PointF computeScrollVectorForPosition(int i);
        }

        protected abstract void onSeekTargetStep(int i, int i2, State state, a aVar);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(View view, State state, a aVar);

        void start(RecyclerView recyclerView, LayoutManager layoutManager) {
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = layoutManager;
            if (this.mTargetPosition == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            this.mRecyclerView.mState.a = this.mTargetPosition;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.a();
        }

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        @Nullable
        public LayoutManager getLayoutManager() {
            return this.mLayoutManager;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void stop() {
            if (this.mRunning) {
                onStop();
                this.mRecyclerView.mState.a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mRunning = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onAnimation(int i, int i2) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (!this.mRunning || this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            this.mPendingInitialRun = false;
            if (this.mTargetView != null) {
                if (getChildPosition(this.mTargetView) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.a(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                boolean z = this.mRecyclingAction.d >= 0;
                this.mRecyclingAction.a(recyclerView);
                if (z) {
                    if (this.mRunning) {
                        this.mPendingInitialRun = true;
                        recyclerView.mViewFlinger.a();
                        return;
                    }
                    stop();
                }
            }
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.findViewByPosition(i);
        }

        @Deprecated
        public void instantScrollToPosition(int i) {
            this.mRecyclerView.scrollToPosition(i);
        }

        protected void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void normalize(PointF pointF) {
            float sqrt = (float) Math.sqrt((pointF.x * pointF.x) + (pointF.y * pointF.y));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public static class a {
            public int a;
            public int b;
            public int c;
            int d;
            public Interpolator e;
            public boolean f;
            private int g;

            public a(int i, int i2) {
                this(0, 0, Integer.MIN_VALUE, null);
            }

            private a(int i, int i2, int i3, Interpolator interpolator) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.a = i;
                this.b = i2;
                this.c = Integer.MIN_VALUE;
                this.e = null;
            }

            final void a(RecyclerView recyclerView) {
                if (this.d >= 0) {
                    int i = this.d;
                    this.d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f = false;
                } else if (this.f) {
                    a();
                    if (this.e == null) {
                        if (this.c == Integer.MIN_VALUE) {
                            recyclerView.mViewFlinger.a(this.a, this.b);
                        } else {
                            recyclerView.mViewFlinger.a(this.a, this.b, this.c);
                        }
                    } else {
                        recyclerView.mViewFlinger.a(this.a, this.b, this.c, this.e);
                    }
                    this.g++;
                    if (this.g > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                } else {
                    this.g = 0;
                }
            }

            private void a() {
                if (this.e != null && this.c <= 0) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.c <= 0) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public final void a(int i, int i2, int i3, Interpolator interpolator) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
                this.f = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b extends Observable<c> {
        b() {
        }

        public final boolean a() {
            return !this.mObservers.isEmpty();
        }

        public final void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).onChanged();
            }
        }

        public final void a(int i, int i2) {
            a(i, i2, null);
        }

        public final void a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        public final void b(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        public final void c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }

        public final void d(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }
    }

    /* compiled from: ProGuard */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: android.support.v7.widget.RecyclerView.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        Parcelable a;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.support.v4.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.a, 0);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class State {
        int a = -1;
        int b = 0;
        int c = 0;
        int d = 1;
        int e = 0;
        boolean f = false;
        public boolean g = false;
        boolean h = false;
        boolean i = false;
        boolean j = false;
        boolean k = false;
        int l;
        long m;
        int n;
        int o;
        int p;
        private SparseArray<Object> q;

        /* compiled from: ProGuard */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface LayoutState {
        }

        final void a(int i) {
            if ((this.d & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
        }

        public final boolean a() {
            return this.j;
        }

        public final boolean b() {
            return this.a != -1;
        }

        public final int c() {
            return this.g ? this.b - this.c : this.e;
        }

        public final String toString() {
            return "State{mTargetPosition=" + this.a + ", mData=" + this.q + ", mItemCount=" + this.e + ", mPreviousLayoutItemCount=" + this.b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.c + ", mStructureChanged=" + this.f + ", mInPreLayout=" + this.g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.k + '}';
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class e implements ItemAnimator.b {
        e() {
        }

        @Override // android.support.v7.widget.RecyclerView.ItemAnimator.b
        public final void a(s sVar) {
            sVar.setIsRecyclable(true);
            if (sVar.mShadowedHolder != null && sVar.mShadowingHolder == null) {
                sVar.mShadowedHolder = null;
            }
            sVar.mShadowingHolder = null;
            if (sVar.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(sVar.itemView) || !sVar.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(sVar.itemView, false);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class ItemAnimator {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private b mListener = null;
        private ArrayList<a> mFinishedListeners = new ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        /* compiled from: ProGuard */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface AdapterChanges {
        }

        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public interface a {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public interface b {
            void a(s sVar);
        }

        public abstract boolean animateAppearance(@NonNull s sVar, @Nullable c cVar, @NonNull c cVar2);

        public abstract boolean animateChange(@NonNull s sVar, @NonNull s sVar2, @NonNull c cVar, @NonNull c cVar2);

        public abstract boolean animateDisappearance(@NonNull s sVar, @NonNull c cVar, @Nullable c cVar2);

        public abstract boolean animatePersistence(@NonNull s sVar, @NonNull c cVar, @NonNull c cVar2);

        public boolean canReuseUpdatedViewHolder(@NonNull s sVar) {
            return true;
        }

        public abstract void endAnimation(s sVar);

        public abstract void endAnimations();

        public abstract boolean isRunning();

        public void onAnimationFinished(s sVar) {
        }

        public void onAnimationStarted(s sVar) {
        }

        public abstract void runPendingAnimations();

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public void setMoveDuration(long j) {
            this.mMoveDuration = j;
        }

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public void setAddDuration(long j) {
            this.mAddDuration = j;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public void setRemoveDuration(long j) {
            this.mRemoveDuration = j;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public void setChangeDuration(long j) {
            this.mChangeDuration = j;
        }

        void setListener(b bVar) {
            this.mListener = bVar;
        }

        @NonNull
        public c recordPreLayoutInformation(@NonNull State state, @NonNull s sVar, int i, @NonNull List<Object> list) {
            return obtainHolderInfo().a(sVar, 0);
        }

        @NonNull
        public c recordPostLayoutInformation(@NonNull State state, @NonNull s sVar) {
            return obtainHolderInfo().a(sVar, 0);
        }

        static int buildAdapterChangeFlagsForAnimations(s sVar) {
            int i = sVar.mFlags & 14;
            if (sVar.isInvalid()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int oldPosition = sVar.getOldPosition();
                int adapterPosition = sVar.getAdapterPosition();
                return (oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition) ? i : i | 2048;
            }
            return i;
        }

        public final void dispatchAnimationFinished(s sVar) {
            onAnimationFinished(sVar);
            if (this.mListener != null) {
                this.mListener.a(sVar);
            }
        }

        public final void dispatchAnimationStarted(s sVar) {
            onAnimationStarted(sVar);
        }

        public final boolean isRunning(a aVar) {
            boolean isRunning = isRunning();
            if (aVar != null && isRunning) {
                this.mFinishedListeners.add(aVar);
            }
            return isRunning;
        }

        public boolean canReuseUpdatedViewHolder(@NonNull s sVar, @NonNull List<Object> list) {
            return canReuseUpdatedViewHolder(sVar);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i = 0; i < size; i++) {
                this.mFinishedListeners.get(i);
            }
            this.mFinishedListeners.clear();
        }

        public c obtainHolderInfo() {
            return new c();
        }

        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public static class c {
            public int a;
            public int b;
            public int c;
            public int d;

            public final c a(s sVar, int i) {
                View view = sVar.itemView;
                this.a = view.getLeft();
                this.b = view.getTop();
                this.c = view.getRight();
                this.d = view.getBottom();
                return this;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        if (this.mChildDrawingOrderCallback == null) {
            return super.getChildDrawingOrder(i2, i3);
        }
        return this.mChildDrawingOrderCallback.a(i2, i3);
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new NestedScrollingChildHelper(this);
        }
        return this.mScrollingChildHelper;
    }
}
