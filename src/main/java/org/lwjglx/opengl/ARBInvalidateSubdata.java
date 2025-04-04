package org.lwjglx.opengl;

public class ARBInvalidateSubdata {

    public static void glInvalidateBufferData(int buffer) {
        org.lwjgl3.opengl.ARBInvalidateSubdata.glInvalidateBufferData(buffer);
    }

    public static void glInvalidateBufferSubData(int buffer, long offset, long length) {
        org.lwjgl3.opengl.ARBInvalidateSubdata.glInvalidateBufferSubData(buffer, offset, length);
    }

    public static void glInvalidateFramebuffer(int target, java.nio.IntBuffer attachments) {
        org.lwjgl3.opengl.ARBInvalidateSubdata.glInvalidateFramebuffer(target, attachments);
    }

    public static void glInvalidateSubFramebuffer(int target, java.nio.IntBuffer attachments, int x, int y, int width,
            int height) {
        org.lwjgl3.opengl.ARBInvalidateSubdata.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
    }

    public static void glInvalidateTexImage(int texture, int level) {
        org.lwjgl3.opengl.ARBInvalidateSubdata.glInvalidateTexImage(texture, level);
    }

    public static void glInvalidateTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width,
            int height, int depth) {
        org.lwjgl3.opengl.ARBInvalidateSubdata
                .glInvalidateTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth);
    }
}
