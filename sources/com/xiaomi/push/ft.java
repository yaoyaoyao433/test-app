package com.xiaomi.push;

import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
/* loaded from: classes6.dex */
public final class ft {
    private static int a = 5000;
    private static int b = 330000;
    private static int c = 600000;
    private static int d = 330000;
    private static Vector<String> e = new Vector<>();

    private ft() {
    }

    private static int a(XmlPullParser xmlPullParser, int i) {
        try {
            return Integer.parseInt(xmlPullParser.nextText());
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return i;
        }
    }

    public static String a() {
        return "3.1.0";
    }

    public static int b() {
        return b;
    }

    public static int c() {
        return c;
    }

    private static ClassLoader[] d() {
        ClassLoader[] classLoaderArr = {ft.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            ClassLoader classLoader = classLoaderArr[i];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.net.URL] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.InputStream] */
    static {
        Exception e2;
        InputStream inputStream;
        try {
            for (ClassLoader classLoader : d()) {
                Enumeration<URL> resources = classLoader.getResources("META-INF/smack-config.xml");
                while (resources.hasMoreElements()) {
                    URL nextElement = resources.nextElement();
                    try {
                        try {
                            inputStream = HttpURLWrapper.wrapOpenStream(nextElement);
                            try {
                                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                                newPullParser.setInput(inputStream, "UTF-8");
                                int eventType = newPullParser.getEventType();
                                do {
                                    if (eventType == 2) {
                                        if (newPullParser.getName().equals("className")) {
                                            String nextText = newPullParser.nextText();
                                            try {
                                                Class.forName(nextText);
                                            } catch (ClassNotFoundException unused) {
                                                System.err.println("Error! A startup class specified in smack-config.xml could not be loaded: " + nextText);
                                            }
                                        } else if (newPullParser.getName().equals("packetReplyTimeout")) {
                                            a = a(newPullParser, a);
                                        } else if (newPullParser.getName().equals("keepAliveInterval")) {
                                            b = a(newPullParser, b);
                                        } else if (newPullParser.getName().equals("mechName")) {
                                            e.add(newPullParser.nextText());
                                        }
                                    }
                                    eventType = newPullParser.next();
                                } while (eventType != 1);
                            } catch (Exception e3) {
                                e2 = e3;
                                e2.printStackTrace();
                                inputStream.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            try {
                                nextElement.close();
                            } catch (Exception unused2) {
                            }
                            throw th;
                        }
                    } catch (Exception e4) {
                        e2 = e4;
                        inputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        nextElement = 0;
                        nextElement.close();
                        throw th;
                    }
                    try {
                        inputStream.close();
                    } catch (Exception unused3) {
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
