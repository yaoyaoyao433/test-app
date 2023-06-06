package com.sankuai.waimai.ugc.creator.widgets.tag;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.widget.ViewDragHelper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.utils.g;
import com.sankuai.waimai.ugc.creator.widgets.tag.TagView;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TagBoard extends ConstraintLayout {
    public static ChangeQuickRedirect g;
    public SparseArray<TagData> h;
    public final GestureDetector i;
    private ViewDragHelper j;
    private a k;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(float f, float f2, int i);

        void a(ArrayList<TagData> arrayList);
    }

    public static /* synthetic */ void c(TagBoard tagBoard) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, tagBoard, changeQuickRedirect, false, "10446038c7c8e89af303155e27c6a959", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, tagBoard, changeQuickRedirect, false, "10446038c7c8e89af303155e27c6a959");
        } else if (tagBoard.k != null) {
            tagBoard.k.a(tagBoard.getTagDataList());
        }
    }

    public TagBoard(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "987d095b4d8a6b6dea5271f14be003d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "987d095b4d8a6b6dea5271f14be003d3");
        }
    }

    public TagBoard(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cbe13c7efdd10582273ce0284d9eb63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cbe13c7efdd10582273ce0284d9eb63");
        }
    }

    public TagBoard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fc73a1e3736510028644dc646028ba2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fc73a1e3736510028644dc646028ba2");
            return;
        }
        this.h = new SparseArray<>();
        this.i = new GestureDetector(getContext(), new GestureDetector.OnGestureListener() { // from class: com.sankuai.waimai.ugc.creator.widgets.tag.TagBoard.3
            public static ChangeQuickRedirect a;

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c163c1c30685bced19a0c53dbb997e4", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c163c1c30685bced19a0c53dbb997e4")).booleanValue();
                }
                float x = motionEvent.getX() / TagBoard.this.getWidth();
                float y = motionEvent.getY() / TagBoard.this.getHeight();
                int i2 = ((double) x) > 0.5d ? 2 : 1;
                if (TagBoard.this.k != null) {
                    TagBoard.this.k.a(x, y, i2);
                }
                return false;
            }
        });
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e096fa2bf15640cf7d391f4e17f21364", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e096fa2bf15640cf7d391f4e17f21364");
        } else {
            this.j = ViewDragHelper.create(this, 1.0f, new ViewDragHelper.Callback() { // from class: com.sankuai.waimai.ugc.creator.widgets.tag.TagBoard.1
                public static ChangeQuickRedirect a;

                @Override // android.support.v4.widget.ViewDragHelper.Callback
                public void onViewReleased(@NonNull View view, float f, float f2) {
                }

                @Override // android.support.v4.widget.ViewDragHelper.Callback
                public boolean tryCaptureView(@NonNull View view, int i2) {
                    Object[] objArr3 = {view, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0c53c905e1fe12014c1d1df8da66d3c9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0c53c905e1fe12014c1d1df8da66d3c9")).booleanValue() : TagBoard.a(TagBoard.this, view);
                }

                @Override // android.support.v4.widget.ViewDragHelper.Callback
                public void onViewCaptured(@NonNull View view, int i2) {
                    Object[] objArr3 = {view, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e64eed17b0092ad0dfbbae7b84da4b5b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e64eed17b0092ad0dfbbae7b84da4b5b");
                    } else {
                        view.bringToFront();
                    }
                }

                @Override // android.support.v4.widget.ViewDragHelper.Callback
                public void onViewPositionChanged(@NonNull View view, int i2, int i3, int i4, int i5) {
                    Object[] objArr3 = {view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "57f0d327a000c846927046317c18279a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "57f0d327a000c846927046317c18279a");
                        return;
                    }
                    TagView tagView = (TagView) view;
                    Object[] objArr4 = {Integer.valueOf(i4), Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect4 = TagView.a;
                    if (PatchProxy.isSupport(objArr4, tagView, changeQuickRedirect4, false, "9e0c31c2924f1891d0c10834077f2c8e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, tagView, changeQuickRedirect4, false, "9e0c31c2924f1891d0c10834077f2c8e");
                        return;
                    }
                    ConstraintLayout.a aVar = (ConstraintLayout.a) tagView.getLayoutParams();
                    aVar.topMargin += i5;
                    tagView.setLayoutParams(aVar);
                    tagView.g += i5;
                    ConstraintLayout.a aVar2 = (ConstraintLayout.a) tagView.e.getLayoutParams();
                    int i6 = aVar2.a + i4;
                    aVar2.a = i6;
                    tagView.e.setLayoutParams(aVar2);
                    tagView.f += i4;
                    int width = tagView.b == 2 ? i6 - tagView.h : (tagView.d.getWidth() - i6) - tagView.h;
                    Object[] objArr5 = {Integer.valueOf(width)};
                    ChangeQuickRedirect changeQuickRedirect5 = TagView.a;
                    if (PatchProxy.isSupport(objArr5, tagView, changeQuickRedirect5, false, "92d103304c91622dac4f6eb9e4ea4b87", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, tagView, changeQuickRedirect5, false, "92d103304c91622dac4f6eb9e4ea4b87");
                    } else {
                        tagView.a(tagView.b, width);
                    }
                }

                @Override // android.support.v4.widget.ViewDragHelper.Callback
                public int getViewHorizontalDragRange(@NonNull View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2fa7f58569a8529722027f8da1293546", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2fa7f58569a8529722027f8da1293546")).intValue() : TagBoard.this.j.getTouchSlop() / 2;
                }

                @Override // android.support.v4.widget.ViewDragHelper.Callback
                public int getViewVerticalDragRange(@NonNull View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3217cc8f56c5d7233f7e6f6cd646c493", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3217cc8f56c5d7233f7e6f6cd646c493")).intValue() : TagBoard.this.j.getTouchSlop() / 2;
                }

                @Override // android.support.v4.widget.ViewDragHelper.Callback
                public int clampViewPositionHorizontal(@NonNull View view, int i2, int i3) {
                    int i4;
                    Object[] objArr3 = {view, Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8d5213fa8de934ecf046a237a6842fc2", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8d5213fa8de934ecf046a237a6842fc2")).intValue();
                    }
                    if (TagBoard.a(TagBoard.this, view)) {
                        TagView tagView = (TagView) view;
                        Object[] objArr4 = {Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect4 = TagView.a;
                        if (PatchProxy.isSupport(objArr4, tagView, changeQuickRedirect4, false, "fd4dbbf4781593b75999665961144bf0", RobustBitConfig.DEFAULT_VALUE)) {
                            i4 = ((Integer) PatchProxy.accessDispatch(objArr4, tagView, changeQuickRedirect4, false, "fd4dbbf4781593b75999665961144bf0")).intValue();
                        } else {
                            int left = (tagView.b == 1 ? tagView.getLeft() : tagView.d.getWidth() - tagView.getRight()) - tagView.h;
                            int width = (tagView.b == 1 ? tagView.d.getWidth() - tagView.getLeft() : tagView.getRight()) - tagView.h;
                            int abs = Math.abs(i3);
                            if ((tagView.b != 2 || i3 >= 0) && (tagView.b != 1 || i3 <= 0)) {
                                if (left < abs) {
                                    i4 = i3 > 0 ? left : -left;
                                }
                                i4 = i3;
                            } else {
                                i4 = width - tagView.c;
                                if (i4 < abs) {
                                    if (i4 <= 0) {
                                        i4 = 0;
                                    } else if (i3 <= 0) {
                                        i4 = -i4;
                                    }
                                }
                                i4 = i3;
                            }
                        }
                        return (i2 - i3) + i4;
                    }
                    return i2;
                }

                @Override // android.support.v4.widget.ViewDragHelper.Callback
                public int clampViewPositionVertical(@NonNull View view, int i2, int i3) {
                    int i4;
                    Object[] objArr3 = {view, Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "62821ea965bf36cc196e8ee60ffee3de", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "62821ea965bf36cc196e8ee60ffee3de")).intValue();
                    }
                    if (TagBoard.a(TagBoard.this, view)) {
                        TagView tagView = (TagView) view;
                        Object[] objArr4 = {Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect4 = TagView.a;
                        if (PatchProxy.isSupport(objArr4, tagView, changeQuickRedirect4, false, "8be83b96967de944d8ea1e702f810eaf", RobustBitConfig.DEFAULT_VALUE)) {
                            i4 = ((Integer) PatchProxy.accessDispatch(objArr4, tagView, changeQuickRedirect4, false, "8be83b96967de944d8ea1e702f810eaf")).intValue();
                        } else if (i3 >= 0) {
                            i4 = Math.min((tagView.d.getHeight() - tagView.getBottom()) - tagView.h, i3);
                        } else {
                            i4 = -Math.min(tagView.getTop() - tagView.h, -i3);
                        }
                        return (i2 - i3) + i4;
                    }
                    return i2;
                }
            });
        }
    }

    public final void a(Context context, TagData tagData) {
        Object[] objArr = {context, tagData};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a83cc06e8c26556fa0310fd6353b056b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a83cc06e8c26556fa0310fd6353b056b");
        } else if (tagData == null || TextUtils.isEmpty(tagData.d)) {
        } else {
            TagView tagView = new TagView(context);
            tagView.setCallback(new TagView.a() { // from class: com.sankuai.waimai.ugc.creator.widgets.tag.TagBoard.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.creator.widgets.tag.TagView.a
                public final void a(TagView tagView2, TagData tagData2) {
                    Object[] objArr2 = {tagView2, tagData2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fdf24b77728050dbeea8ada471fac2b3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fdf24b77728050dbeea8ada471fac2b3");
                        return;
                    }
                    TagBoard.this.h.remove(tagView2.getId());
                    TagBoard.c(TagBoard.this);
                    g.a("b_waimai_57a7ioyk_mc", "c_waimai_n2dalt8s", (Activity) TagBoard.this.getContext()).a();
                }

                @Override // com.sankuai.waimai.ugc.creator.widgets.tag.TagView.a
                public final void b(TagView tagView2, TagData tagData2) {
                    Object[] objArr2 = {tagView2, tagData2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84ee004ac0b89217ef68eaa114a64761", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84ee004ac0b89217ef68eaa114a64761");
                        return;
                    }
                    TagBoard.this.h.put(tagView2.getId(), tagData2);
                    TagBoard.c(TagBoard.this);
                }
            });
            tagView.a(this, tagData);
            this.h.put(tagView.getId(), tagData);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b336b217ef37da0e3255ae035f74421", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b336b217ef37da0e3255ae035f74421")).booleanValue();
        }
        if (motionEvent.getAction() == 0 && (this.j.findTopChildUnder((int) motionEvent.getX(), (int) motionEvent.getY()) instanceof TagView)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (this.j.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a11711770af79a6453a34b7c47072866", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a11711770af79a6453a34b7c47072866")).booleanValue();
        }
        this.j.processTouchEvent(motionEvent);
        this.i.onTouchEvent(motionEvent);
        return true;
    }

    private ArrayList<TagData> getTagDataList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2372838ddf4b0959e03ed11b94e0dedc", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2372838ddf4b0959e03ed11b94e0dedc");
        }
        ArrayList<TagData> arrayList = new ArrayList<>();
        for (int i = 0; i < this.h.size(); i++) {
            arrayList.add(this.h.valueAt(i));
        }
        return arrayList;
    }

    public void setCallback(a aVar) {
        this.k = aVar;
    }

    public static /* synthetic */ boolean a(TagBoard tagBoard, View view) {
        return view instanceof TagView;
    }
}
