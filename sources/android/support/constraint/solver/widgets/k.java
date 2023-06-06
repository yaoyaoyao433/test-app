package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.f;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k {
    static boolean[] a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(g gVar, android.support.constraint.solver.e eVar, f fVar) {
        if (gVar.G[0] != f.a.b && fVar.G[0] == f.a.d) {
            int i = fVar.w.e;
            int m = gVar.m() - fVar.y.e;
            fVar.w.i = eVar.a(fVar.w);
            fVar.y.i = eVar.a(fVar.y);
            eVar.a(fVar.w.i, i);
            eVar.a(fVar.y.i, m);
            fVar.c = 2;
            fVar.c(i, m);
        }
        if (gVar.G[1] == f.a.b || fVar.G[1] != f.a.d) {
            return;
        }
        int i2 = fVar.x.e;
        int n = gVar.n() - fVar.z.e;
        fVar.x.i = eVar.a(fVar.x);
        fVar.z.i = eVar.a(fVar.z);
        eVar.a(fVar.x.i, i2);
        eVar.a(fVar.z.i, n);
        if (fVar.S > 0 || fVar.ab == 8) {
            fVar.A.i = eVar.a(fVar.A);
            eVar.a(fVar.A.i, fVar.S + i2);
        }
        fVar.d = 2;
        fVar.d(i2, n);
    }

    private static boolean a(f fVar, int i) {
        if (fVar.G[i] != f.a.c) {
            return false;
        }
        if (fVar.K != 0.0f) {
            return fVar.G[i != 0 ? (char) 0 : (char) 1] == f.a.c ? false : false;
        }
        if (i == 0) {
            if (fVar.g != 0 || fVar.j != 0 || fVar.k != 0) {
                return false;
            }
        } else if (fVar.h != 0 || fVar.m != 0 || fVar.n != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, f fVar) {
        fVar.g();
        m mVar = fVar.w.a;
        m mVar2 = fVar.x.a;
        m mVar3 = fVar.y.a;
        m mVar4 = fVar.z.a;
        boolean z = (i & 8) == 8;
        boolean z2 = fVar.G[0] == f.a.c && a(fVar, 0);
        if (mVar.g != 4 && mVar3.g != 4) {
            if (fVar.G[0] == f.a.a || (z2 && fVar.ab == 8)) {
                if (fVar.w.d != null || fVar.y.d != null) {
                    if (fVar.w.d == null || fVar.y.d != null) {
                        if (fVar.w.d != null || fVar.y.d == null) {
                            if (fVar.w.d != null && fVar.y.d != null) {
                                mVar.g = 2;
                                mVar3.g = 2;
                                if (z) {
                                    fVar.i().a(mVar);
                                    fVar.i().a(mVar3);
                                    mVar.b(mVar3, -1, fVar.i());
                                    mVar3.b(mVar, 1, fVar.i());
                                } else {
                                    mVar.b(mVar3, -fVar.m());
                                    mVar3.b(mVar, fVar.m());
                                }
                            }
                        } else {
                            mVar.g = 1;
                            mVar3.g = 1;
                            mVar.a(mVar3, -fVar.m());
                            if (z) {
                                mVar.a(mVar3, -1, fVar.i());
                            } else {
                                mVar.a(mVar3, -fVar.m());
                            }
                        }
                    } else {
                        mVar.g = 1;
                        mVar3.g = 1;
                        if (z) {
                            mVar3.a(mVar, 1, fVar.i());
                        } else {
                            mVar3.a(mVar, fVar.m());
                        }
                    }
                } else {
                    mVar.g = 1;
                    mVar3.g = 1;
                    if (z) {
                        mVar3.a(mVar, 1, fVar.i());
                    } else {
                        mVar3.a(mVar, fVar.m());
                    }
                }
            } else if (z2) {
                int m = fVar.m();
                mVar.g = 1;
                mVar3.g = 1;
                if (fVar.w.d == null && fVar.y.d == null) {
                    if (z) {
                        mVar3.a(mVar, 1, fVar.i());
                    } else {
                        mVar3.a(mVar, m);
                    }
                } else if (fVar.w.d == null || fVar.y.d != null) {
                    if (fVar.w.d != null || fVar.y.d == null) {
                        if (fVar.w.d != null && fVar.y.d != null) {
                            if (z) {
                                fVar.i().a(mVar);
                                fVar.i().a(mVar3);
                            }
                            if (fVar.K == 0.0f) {
                                mVar.g = 3;
                                mVar3.g = 3;
                                mVar.b(mVar3, 0.0f);
                                mVar3.b(mVar, 0.0f);
                            } else {
                                mVar.g = 2;
                                mVar3.g = 2;
                                mVar.b(mVar3, -m);
                                mVar3.b(mVar, m);
                                fVar.e(m);
                            }
                        }
                    } else if (z) {
                        mVar.a(mVar3, -1, fVar.i());
                    } else {
                        mVar.a(mVar3, -m);
                    }
                } else if (z) {
                    mVar3.a(mVar, 1, fVar.i());
                } else {
                    mVar3.a(mVar, m);
                }
            }
        }
        boolean z3 = fVar.G[1] == f.a.c && a(fVar, 1);
        if (mVar2.g == 4 || mVar4.g == 4) {
            return;
        }
        if (fVar.G[1] != f.a.a && (!z3 || fVar.ab != 8)) {
            if (z3) {
                int n = fVar.n();
                mVar2.g = 1;
                mVar4.g = 1;
                if (fVar.x.d == null && fVar.z.d == null) {
                    if (z) {
                        mVar4.a(mVar2, 1, fVar.j());
                    } else {
                        mVar4.a(mVar2, n);
                    }
                } else if (fVar.x.d != null && fVar.z.d == null) {
                    if (z) {
                        mVar4.a(mVar2, 1, fVar.j());
                    } else {
                        mVar4.a(mVar2, n);
                    }
                } else if (fVar.x.d == null && fVar.z.d != null) {
                    if (z) {
                        mVar2.a(mVar4, -1, fVar.j());
                    } else {
                        mVar2.a(mVar4, -n);
                    }
                } else if (fVar.x.d == null || fVar.z.d == null) {
                } else {
                    if (z) {
                        fVar.j().a(mVar2);
                        fVar.i().a(mVar4);
                    }
                    if (fVar.K == 0.0f) {
                        mVar2.g = 3;
                        mVar4.g = 3;
                        mVar2.b(mVar4, 0.0f);
                        mVar4.b(mVar2, 0.0f);
                        return;
                    }
                    mVar2.g = 2;
                    mVar4.g = 2;
                    mVar2.b(mVar4, -n);
                    mVar4.b(mVar2, n);
                    fVar.f(n);
                    if (fVar.S > 0) {
                        fVar.A.a.a(1, mVar2, fVar.S);
                    }
                }
            }
        } else if (fVar.x.d != null || fVar.z.d != null) {
            if (fVar.x.d == null || fVar.z.d != null) {
                if (fVar.x.d != null || fVar.z.d == null) {
                    if (fVar.x.d == null || fVar.z.d == null) {
                        return;
                    }
                    mVar2.g = 2;
                    mVar4.g = 2;
                    if (z) {
                        mVar2.b(mVar4, -1, fVar.j());
                        mVar4.b(mVar2, 1, fVar.j());
                        fVar.j().a(mVar2);
                        fVar.i().a(mVar4);
                    } else {
                        mVar2.b(mVar4, -fVar.n());
                        mVar4.b(mVar2, fVar.n());
                    }
                    if (fVar.S > 0) {
                        fVar.A.a.a(1, mVar2, fVar.S);
                        return;
                    }
                    return;
                }
                mVar2.g = 1;
                mVar4.g = 1;
                if (z) {
                    mVar2.a(mVar4, -1, fVar.j());
                } else {
                    mVar2.a(mVar4, -fVar.n());
                }
                if (fVar.S > 0) {
                    fVar.A.a.a(1, mVar2, fVar.S);
                    return;
                }
                return;
            }
            mVar2.g = 1;
            mVar4.g = 1;
            if (z) {
                mVar4.a(mVar2, 1, fVar.j());
            } else {
                mVar4.a(mVar2, fVar.n());
            }
            if (fVar.S > 0) {
                fVar.A.a.a(1, mVar2, fVar.S);
            }
        } else {
            mVar2.g = 1;
            mVar4.g = 1;
            if (z) {
                mVar4.a(mVar2, 1, fVar.j());
            } else {
                mVar4.a(mVar2, fVar.n());
            }
            if (fVar.A.d != null) {
                fVar.A.a.g = 1;
                mVar2.a(1, fVar.A.a, -fVar.S);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r7.ai == 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
        if (r7.aj == 2) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00f4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.support.constraint.solver.widgets.g r22, android.support.constraint.solver.e r23, int r24, int r25, android.support.constraint.solver.widgets.d r26) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.k.a(android.support.constraint.solver.widgets.g, android.support.constraint.solver.e, int, int, android.support.constraint.solver.widgets.d):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(f fVar, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        fVar.E[i3].a.e = fVar.H.w.a;
        fVar.E[i3].a.f = i2;
        fVar.E[i3].a.i = 1;
        fVar.E[i4].a.e = fVar.E[i3].a;
        fVar.E[i4].a.f = fVar.b(i);
        fVar.E[i4].a.i = 1;
    }
}
