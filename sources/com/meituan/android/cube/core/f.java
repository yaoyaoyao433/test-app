package com.meituan.android.cube.core;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.bus.a;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.android.cube.core.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class f {
    public static ChangeQuickRedirect a;
    @NonNull
    protected b b;
    final BlockLifecycle c;
    d d;
    public boolean e;
    private final c f;
    private com.meituan.android.bus.a g;
    private com.meituan.android.bus.a h;
    private boolean i;

    public View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        return null;
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c43fbb547177564b7ebcf1ee0778c75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c43fbb547177564b7ebcf1ee0778c75");
            return;
        }
        this.f = new c(this);
        this.c = new BlockLifecycle(this);
        this.d = new d(this);
        this.i = false;
        this.e = false;
    }

    private com.meituan.android.bus.a r() {
        return this.h != null ? this.h : this.g;
    }

    public final b bC_() {
        return this.b;
    }

    public final View aQ_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30d245f476f0f896cbfa206a075b7ae6", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30d245f476f0f896cbfa206a075b7ae6");
        }
        if (!h()) {
            com.meituan.android.cube.debug.b.b(String.format("%s createView失败：当前没有attach，context为null，可能是因为没有调用addBlock", this), new Object[0]);
            return null;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5df46d362a7834c384a1bbc320e443c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5df46d362a7834c384a1bbc320e443c");
        } else {
            try {
                Class.forName(getClass().getName() + "EventHelper");
                this.i = true;
            } catch (ClassNotFoundException unused) {
                this.i = false;
            }
            if (getClass().isAnnotationPresent(Cube.class) && ((Cube) getClass().getAnnotation(Cube.class)).interrupt()) {
                this.h = com.meituan.android.bus.a.a(new a.C0185a());
            }
            if (this.h == null && this.g == null) {
                this.g = com.meituan.android.bus.a.a(new a.C0185a());
            }
            if (this.i) {
                if (this.h != null) {
                    this.h.a(this);
                } else {
                    this.g.a(this);
                }
            }
        }
        d dVar = this.d;
        Context a2 = this.b.a();
        Object[] objArr3 = {a2};
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "fa667a62081faed0eb057816f6a534aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "fa667a62081faed0eb057816f6a534aa");
        } else {
            dVar.c = a2;
            if (dVar.b == null) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = d.a;
                if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "2b9365cfde8d42faa206d47431cd9673", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "2b9365cfde8d42faa206d47431cd9673");
                } else {
                    dVar.b = dVar.e.a(LayoutInflater.from(dVar.c), dVar.d);
                    Object[] objArr5 = {dVar.b};
                    ChangeQuickRedirect changeQuickRedirect5 = d.a;
                    View view = PatchProxy.isSupport(objArr5, dVar, changeQuickRedirect5, false, "4f1de94691a0390cc0de82d544be9a8e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr5, dVar, changeQuickRedirect5, false, "4f1de94691a0390cc0de82d544be9a8e") : null;
                    if (view == null) {
                        view = dVar.b;
                    }
                    dVar.b = view;
                    dVar.b = com.meituan.android.cube.debug.a.a(dVar.b, dVar.c, dVar.e, -2203478);
                    if (dVar.f) {
                        if (dVar.d == null) {
                            com.meituan.android.cube.debug.b.b("目标容器为null，无法添加view", new Object[0]);
                            throw new IllegalStateException("目标容器为null，无法添加view！");
                        } else if (dVar.d.getChildCount() > 0) {
                            com.meituan.android.cube.debug.b.b("目标容器已经有view，无法添加新的view", new Object[0]);
                            throw new IllegalStateException("目标容器已经有view，无法添加新的view！");
                        } else {
                            dVar.d.addView(dVar.b);
                        }
                    }
                }
            }
        }
        return this.d.b;
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aae464e26a6f14f73679b3add477a5f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aae464e26a6f14f73679b3add477a5f6");
            return;
        }
        this.b = bVar;
        this.b.a(this);
        a(bVar.b);
    }

    @CallSuper
    public void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfd3a2e135bf31caeda6a7dd6501bc5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfd3a2e135bf31caeda6a7dd6501bc5b");
        } else {
            com.meituan.android.cube.debug.b.a(b("onCreate"), new Object[0]);
        }
    }

    @CallSuper
    public void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38f69491dbee4eedade94f2e1409d8ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38f69491dbee4eedade94f2e1409d8ee");
        } else {
            com.meituan.android.cube.debug.b.a(b("onViewCreated"), new Object[0]);
        }
    }

    @CallSuper
    public void aR_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1f477c1de6653b4669cf4533caf694c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1f477c1de6653b4669cf4533caf694c");
        } else {
            com.meituan.android.cube.debug.b.a(b("onStart"), new Object[0]);
        }
    }

    @CallSuper
    public void aX_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24aecca2c0580d68dd360f1b0f69618e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24aecca2c0580d68dd360f1b0f69618e");
        } else {
            com.meituan.android.cube.debug.b.a(b("onResume"), new Object[0]);
        }
    }

    @CallSuper
    public void bc_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "738d31e9f9d6fe34ac5dd07d76209a0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "738d31e9f9d6fe34ac5dd07d76209a0e");
        } else {
            com.meituan.android.cube.debug.b.a(b("onPause"), new Object[0]);
        }
    }

    @CallSuper
    public void bD_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50bbe5e53887e948e2b8ba41c11f55e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50bbe5e53887e948e2b8ba41c11f55e5");
        } else {
            com.meituan.android.cube.debug.b.a(b("onStop"), new Object[0]);
        }
    }

    @CallSuper
    public void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38a4a513de37ab36e806d205e40b23be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38a4a513de37ab36e806d205e40b23be");
            return;
        }
        this.e = true;
        com.meituan.android.cube.debug.b.a(b("onDestroy"), new Object[0]);
        b bVar = this.b;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "ba26a83d64531bb592a0d2ad3d38b6b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "ba26a83d64531bb592a0d2ad3d38b6b3");
        } else {
            e eVar = bVar.e;
            Object[] objArr3 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "45a8a534f7dc71dcbc58f17ece5b4dfc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "45a8a534f7dc71dcbc58f17ece5b4dfc");
            } else if (this instanceof com.meituan.android.cube.core.eventhandler.event.a) {
                eVar.b.remove(this);
            }
        }
        if (this.i) {
            if (this.h != null) {
                this.h.b(this);
            } else if (this.g != null) {
                this.g.b(this);
            }
        }
    }

    @NonNull
    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea9f73ece31c51bb6ee0cb245c48d48e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea9f73ece31c51bb6ee0cb245c48d48e");
        }
        return p() + "[" + Integer.toHexString(hashCode()) + "]->" + str;
    }

    @CallSuper
    public void a(@NonNull b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "026d70a8884a66ccd62b737192872415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "026d70a8884a66ccd62b737192872415");
            return;
        }
        BlockLifecycle blockLifecycle = this.c;
        Object[] objArr2 = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = BlockLifecycle.a;
        if (PatchProxy.isSupport(objArr2, blockLifecycle, changeQuickRedirect2, false, "61e543bba653771146af9e1fd484e769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, blockLifecycle, changeQuickRedirect2, false, "61e543bba653771146af9e1fd484e769");
        } else if (i < 0 || i > 5) {
        } else {
            if (i > blockLifecycle.c) {
                int i2 = blockLifecycle.c;
                blockLifecycle.c = i;
                switch (i2) {
                    case 0:
                        if (i > 0) {
                            Object[] objArr3 = {bVar};
                            ChangeQuickRedirect changeQuickRedirect3 = BlockLifecycle.a;
                            if (PatchProxy.isSupport(objArr3, blockLifecycle, changeQuickRedirect3, false, "e5d98846a821ae7eaf2d0488463fb8f0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, blockLifecycle, changeQuickRedirect3, false, "e5d98846a821ae7eaf2d0488463fb8f0");
                            } else {
                                blockLifecycle.b.a(bVar);
                            }
                        }
                    case 1:
                        if (i > 1 && !blockLifecycle.d) {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = BlockLifecycle.a;
                            View aQ_ = PatchProxy.isSupport(objArr4, blockLifecycle, changeQuickRedirect4, false, "a8cddaa87f5b113091e54d5e8e40e25d", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr4, blockLifecycle, changeQuickRedirect4, false, "a8cddaa87f5b113091e54d5e8e40e25d") : blockLifecycle.b.aQ_();
                            if (aQ_ != null) {
                                Object[] objArr5 = {aQ_};
                                ChangeQuickRedirect changeQuickRedirect5 = BlockLifecycle.a;
                                if (PatchProxy.isSupport(objArr5, blockLifecycle, changeQuickRedirect5, false, "b893a384880d56e0b75d5935afb5d9d2", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, blockLifecycle, changeQuickRedirect5, false, "b893a384880d56e0b75d5935afb5d9d2");
                                } else {
                                    blockLifecycle.b.a_(aQ_);
                                }
                            }
                        }
                        break;
                    case 2:
                    case 3:
                        if (i > 3) {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = BlockLifecycle.a;
                            if (PatchProxy.isSupport(objArr6, blockLifecycle, changeQuickRedirect6, false, "e4badb8bd6f14c631e54bd8e3c9d875b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, blockLifecycle, changeQuickRedirect6, false, "e4badb8bd6f14c631e54bd8e3c9d875b");
                            } else {
                                blockLifecycle.b.aR_();
                            }
                        }
                    case 4:
                        if (i > 4) {
                            Object[] objArr7 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect7 = BlockLifecycle.a;
                            if (!PatchProxy.isSupport(objArr7, blockLifecycle, changeQuickRedirect7, false, "f4047cfa280bb38d941ff8e413e18398", RobustBitConfig.DEFAULT_VALUE)) {
                                blockLifecycle.b.aX_();
                                break;
                            } else {
                                PatchProxy.accessDispatch(objArr7, blockLifecycle, changeQuickRedirect7, false, "f4047cfa280bb38d941ff8e413e18398");
                                break;
                            }
                        }
                        break;
                }
                blockLifecycle.a(i2, i);
            } else if (i < blockLifecycle.c) {
                int i3 = blockLifecycle.c;
                blockLifecycle.a(i3, i);
                blockLifecycle.c = i;
                switch (i3) {
                    case 1:
                    case 2:
                    case 3:
                        break;
                    case 5:
                        if (i < 5) {
                            Object[] objArr8 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect8 = BlockLifecycle.a;
                            if (PatchProxy.isSupport(objArr8, blockLifecycle, changeQuickRedirect8, false, "592e3ee56365f15bea11b651e4a7d8eb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, blockLifecycle, changeQuickRedirect8, false, "592e3ee56365f15bea11b651e4a7d8eb");
                            } else {
                                blockLifecycle.b.bc_();
                            }
                        }
                    case 4:
                        if (i < 4) {
                            Object[] objArr9 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect9 = BlockLifecycle.a;
                            if (!PatchProxy.isSupport(objArr9, blockLifecycle, changeQuickRedirect9, false, "f9c45d3235d5acb37043842f25a11db2", RobustBitConfig.DEFAULT_VALUE)) {
                                blockLifecycle.b.bD_();
                                break;
                            } else {
                                PatchProxy.accessDispatch(objArr9, blockLifecycle, changeQuickRedirect9, false, "f9c45d3235d5acb37043842f25a11db2");
                                break;
                            }
                        }
                        break;
                    default:
                        return;
                }
                if (i <= 0) {
                    Object[] objArr10 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect10 = BlockLifecycle.a;
                    if (PatchProxy.isSupport(objArr10, blockLifecycle, changeQuickRedirect10, false, "5a52b50841fc36846d934b748de537c0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, blockLifecycle, changeQuickRedirect10, false, "5a52b50841fc36846d934b748de537c0");
                    } else {
                        blockLifecycle.b.bE_();
                    }
                }
            }
        }
    }

    public boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e63645f0a778e4c05ae9ec3d95c962c0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e63645f0a778e4c05ae9ec3d95c962c0")).booleanValue() : this.c.c > 0;
    }

    public View i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e9a97535518947fd309f2721e369204", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e9a97535518947fd309f2721e369204") : this.d.b;
    }

    public void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2da08698fc4857c063d09a14190e4efd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2da08698fc4857c063d09a14190e4efd");
            return;
        }
        d dVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "534895ba89bf7c80d9a9639d859775af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "534895ba89bf7c80d9a9639d859775af");
        } else if (dVar.d != null) {
            dVar.d.setVisibility(8);
        } else if (dVar.b != null) {
            dVar.b.setVisibility(8);
        }
    }

    public void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a72a69a4adebefc123a1281b4c2ec0bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a72a69a4adebefc123a1281b4c2ec0bd");
            return;
        }
        d dVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "dc7bc9b03e33feb1b4eb8d1c8688fde4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "dc7bc9b03e33feb1b4eb8d1c8688fde4");
        } else if (dVar.d != null) {
            dVar.d.setVisibility(0);
        } else if (dVar.b != null) {
            dVar.b.setVisibility(0);
        }
    }

    public static <T extends f> T a(@NonNull ViewGroup viewGroup, @NonNull f fVar, @NonNull T t) {
        Object[] objArr = {viewGroup, fVar, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66ed6f9d4dee3074ae41b60a40ca52a6", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66ed6f9d4dee3074ae41b60a40ca52a6") : (T) fVar.a(viewGroup, (ViewGroup) t, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends f> T a(@IdRes int i, @NonNull T t) {
        f a2;
        Object[] objArr = {Integer.valueOf(i), t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9e967a4f161d76833af3e635790ab95", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9e967a4f161d76833af3e635790ab95");
        }
        Object[] objArr2 = {Integer.valueOf(i), t, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40520bf2b4a69e916577fc28d2c29179", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40520bf2b4a69e916577fc28d2c29179");
        }
        d dVar = this.d;
        Object[] objArr3 = {Integer.valueOf(i), t, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "1ebbd7fff9aa294ef5772ab45bcd5d64", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (f) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "1ebbd7fff9aa294ef5772ab45bcd5d64");
        } else if (i <= 0) {
            throw new IllegalStateException("containerId无效，请传入正确的containerId！");
        } else {
            View findViewById = dVar.b.findViewById(i);
            if (findViewById == null) {
                throw new IllegalStateException("container为null，请传入正确的containerId！");
            }
            if (!(findViewById instanceof ViewGroup)) {
                throw new IllegalStateException("container无效，container必须为ViewGroup的子类！");
            }
            a2 = dVar.a((ViewGroup) findViewById, t, true);
        }
        return (T) b(a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T extends f> T a(@NonNull ViewGroup viewGroup, @NonNull T t, boolean z) {
        Object[] objArr = {viewGroup, t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e279178be899ae5e06023addb819d1a8", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e279178be899ae5e06023addb819d1a8") : (T) b(this.d.a(viewGroup, t, z));
    }

    public final <T extends f> T b(int i, @NonNull T t) {
        Object[] objArr = {Integer.valueOf(i), t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b48b60bca92581b07848e4e92f58515", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b48b60bca92581b07848e4e92f58515");
        }
        d dVar = this.d;
        Object[] objArr2 = {Integer.valueOf(i), t};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "b16301669a649ccad7bdc378f05fefbe", RobustBitConfig.DEFAULT_VALUE)) {
            t = (T) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "b16301669a649ccad7bdc378f05fefbe");
        } else if (i <= 0) {
            throw new IllegalStateException("id无效，请传入正确的view id！");
        } else {
            t.d.b = dVar.b.findViewById(i);
        }
        return (T) b(t);
    }

    public final <T extends f> boolean a(@NonNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d0e210dd65428a5caa1ef3db837de44", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d0e210dd65428a5caa1ef3db837de44")).booleanValue();
        }
        c cVar = this.f;
        Object[] objArr2 = {t};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "6d846e606214b6673f8cbd789e235949", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "6d846e606214b6673f8cbd789e235949");
        } else if (t.h()) {
            cVar.b.remove(t);
            t.a(cVar.c.b, 0);
        }
        d dVar = this.d;
        Object[] objArr3 = {t};
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "d43e25b38fe6ae77ece747588b6d2b2f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "d43e25b38fe6ae77ece747588b6d2b2f")).booleanValue();
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        ViewGroup viewGroup = PatchProxy.isSupport(objArr4, t, changeQuickRedirect4, false, "db7239156e19c0a3a802ee266b21e41a", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup) PatchProxy.accessDispatch(objArr4, t, changeQuickRedirect4, false, "db7239156e19c0a3a802ee266b21e41a") : t.d.d;
        if (viewGroup != null) {
            viewGroup.removeView(t.i());
        }
        return true;
    }

    public final <T extends f> T b(@NonNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dd3311d0c3a7f0d001826b22816285e", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dd3311d0c3a7f0d001826b22816285e");
        }
        t.g = r();
        this.f.a(t);
        return t;
    }

    public final void a(@NonNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4be6ac16620c959867f191a97ceae430", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4be6ac16620c959867f191a97ceae430");
        } else if (this.g != null) {
            this.g.c(obj);
        }
    }

    public final <T extends View> T a(@IdRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e208c3c314fc63495b11587877d6248d", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e208c3c314fc63495b11587877d6248d");
        }
        if (i() == null) {
            return null;
        }
        return (T) i().findViewById(i);
    }

    @Nullable
    public final <T extends f> T b(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a394831fbb74cc2c45615b5275f082ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a394831fbb74cc2c45615b5275f082ee");
        }
        c cVar = this.f;
        Object[] objArr2 = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "4c4ae0362784d5f4df1a694701096471", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "4c4ae0362784d5f4df1a694701096471");
        }
        ArrayList arrayList = new ArrayList();
        cVar.a(arrayList, cVar.c, cls, true);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (T) arrayList.get(0);
    }

    @Nullable
    public final <T extends f> List<T> c(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88ca7a9d94a750c02a850b9b12698331", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88ca7a9d94a750c02a850b9b12698331");
        }
        c cVar = this.f;
        Object[] objArr2 = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "6e94a80d63e7f5c00688897d8bb308b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "6e94a80d63e7f5c00688897d8bb308b7");
        }
        ArrayList arrayList = new ArrayList();
        cVar.a(arrayList, cVar.c, cls, false);
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final void a(@NonNull String str, @NonNull Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10f29112f89a52bd75fde57d09a26b4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10f29112f89a52bd75fde57d09a26b4f");
            return;
        }
        b bVar = this.b;
        Object[] objArr2 = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "d92faacae8435233cde1b15db82617ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "d92faacae8435233cde1b15db82617ff");
            return;
        }
        j jVar = bVar.d;
        Object[] objArr3 = {str, obj};
        ChangeQuickRedirect changeQuickRedirect3 = j.a;
        if (PatchProxy.isSupport(objArr3, jVar, changeQuickRedirect3, false, "28e6eb19bc594446c701c22e17254404", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, jVar, changeQuickRedirect3, false, "28e6eb19bc594446c701c22e17254404");
        } else {
            jVar.b.put(str, obj);
        }
    }

    public final <T> T a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "357491d9f33bf8bff261435163087565", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "357491d9f33bf8bff261435163087565") : (T) this.b.a(str);
    }

    public final <T> T b(@NonNull String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c83062452a3fb48e71f6b271a98d6a1d", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c83062452a3fb48e71f6b271a98d6a1d");
        }
        b bVar = this.b;
        Object[] objArr2 = {str, t};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "2d22b0dd16981acea183ea19240f51f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "2d22b0dd16981acea183ea19240f51f1");
        }
        T t2 = (T) bVar.a(str);
        return t2 == null ? t : t2;
    }

    public FragmentActivity l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d4ddcbc5e4669794af22b32d8e2d553", RobustBitConfig.DEFAULT_VALUE) ? (FragmentActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d4ddcbc5e4669794af22b32d8e2d553") : this.b.b();
    }

    public Context m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40dde5304840bd6d9bb7274422112ea7", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40dde5304840bd6d9bb7274422112ea7") : this.b.a();
    }

    public final List<f> n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa14d80b629076310f4e796565791523", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa14d80b629076310f4e796565791523") : this.f.b;
    }

    @Nullable
    public final String o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ee68546e1dd150cf83146c7f2f01852", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ee68546e1dd150cf83146c7f2f01852") : this.b.c;
    }

    public final String p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1edae7a823b4e94cc8df3c84f553c7d1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1edae7a823b4e94cc8df3c84f553c7d1") : getClass().getSimpleName();
    }

    public final <T extends com.meituan.android.cube.core.eventhandler.event.a> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c6e9430367b8dbe74c5e6c07afd0db2", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c6e9430367b8dbe74c5e6c07afd0db2");
        }
        b bVar = this.b;
        Object[] objArr2 = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "083d67e9855e54da8fb322f4528afd2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "083d67e9855e54da8fb322f4528afd2c");
        }
        e eVar = bVar.e;
        Object[] objArr3 = {cls};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        return PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "db27244813da7853ff7451b2c0dc24af", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "db27244813da7853ff7451b2c0dc24af") : (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new e.a(cls));
    }
}
