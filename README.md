# hello-fx — App JavaFX đầu tiên

Project mẫu JavaFX chạy bằng Gradle. Bạn **không cần cài Gradle** và **không cần sửa cấu hình**: chỉ cần cài JDK và VS Code, mở project rồi bấm Run.

Phiên bản: JDK 21, JavaFX 21.0.13, Gradle 9.8.2 (tự tải qua `gradlew`).

**Tài liệu học JavaFX** (các thẻ cơ bản → thực hành → bài tập → áp dụng vào bài QuanLySanPham): sau khi clone, bấm đúp file [`huong-dan-javafx.html`](huong-dan-javafx.html) để mở bằng trình duyệt.

## 1. Cài đặt (chỉ làm một lần)

1. **JDK 21**: vào [adoptium.net](https://adoptium.net/temurin/releases/?version=21), tải bản **Windows x64 / JDK / .msi** (máy Mac chọn bản macOS `.pkg`). Mở file vừa tải, bấm **Next** đến hết.
2. **VS Code**: tải tại [code.visualstudio.com](https://code.visualstudio.com/).
3. Mở VS Code, nhấn `Ctrl+Shift+X`, tìm và cài **Extension Pack for Java** (của Microsoft).

> **Quan trọng:** cài JDK **trước** khi mở VS Code. Nếu VS Code đang mở lúc bạn cài JDK, hãy tắt hẳn VS Code (**File → Exit**) rồi mở lại.

Kiểm tra: mở terminal **mới** và gõ `java -version`. Nếu thấy dòng `openjdk version "21.0.x"` là đã cài xong.

## 2. Tải project

1. Clone repo rồi mở bằng VS Code:

   ```powershell
   git clone https://github.com/vulinh1704/hello-fx.git
   cd hello-fx
   code .
   ```

   Nếu lệnh `code .` không chạy được, hãy mở VS Code rồi chọn **File → Open Folder → hello-fx**.
2. Đợi khoảng 1 phút cho thanh trạng thái ở dưới cùng VS Code báo đã tải xong project Java.

Khi giáo viên cập nhật project, chạy `git pull` để lấy bản mới.

## 3. Chạy app

**Cách 1 (dễ nhất):** mở file `src/main/java/Launcher.java` và bấm chữ **Run** nhỏ ngay phía trên dòng `public static void main`.

**Cách 2:** mở terminal trong VS Code (`` Ctrl+` ``) rồi gõ:

```powershell
.\gradlew run
```

Máy Mac thì gõ `./gradlew run`.

Lần chạy đầu tiên cần có mạng. Máy sẽ tự tải Gradle và JavaFX về, mất khoảng 1–2 phút. Khi cửa sổ app hiện ra, hãy gõ tên của bạn rồi bấm **Chào**.

> Khi chạy theo cách 1, terminal sẽ in một dòng `WARNING: Unsupported JavaFX configuration...`. Đây là chuyện bình thường, bạn cứ bỏ qua.
>
> **Đừng** bấm Run trong `App.java`, vì app sẽ báo lỗi `JavaFX runtime components are missing`. Hãy luôn chạy từ `Launcher.java`.

## 4. Các file trong project

| File | Vai trò |
| --- | --- |
| `src/main/java/Launcher.java` | Điểm bắt đầu khi bấm Run trong VS Code |
| `src/main/java/App.java` | Mở cửa sổ và nạp giao diện từ `main.fxml` |
| `src/main/resources/main.fxml` | Giao diện: chữ, ô nhập tên, nút Chào |
| `src/main/java/MainController.java` | Xử lý khi bấm nút Chào |
| `build.gradle` | Khai báo thư viện JavaFX, không cần sửa |

Có ba chỗ trong `main.fxml` phải khớp với code Java:

- `fx:controller="MainController"` trỏ tới lớp `MainController`
- mỗi `fx:id="..."` trùng tên với một biến có `@FXML` trong `MainController`
- `onAction="#handleGreet"` trùng tên với method `handleGreet()`

## 5. Lỗi thường gặp

| Lỗi | Cách sửa |
| --- | --- |
| `java is not recognized` | Tắt hẳn VS Code (**File → Exit**) rồi mở lại. Nếu vẫn lỗi, cài lại JDK. |
| `JavaFX runtime components are missing` | Bạn đang bấm Run trong `App.java`. Hãy chạy từ `Launcher.java`. |
| `'gradlew' is not recognized` | Gõ đúng `.\gradlew run` (có `.\` ở đầu). |
| Không thấy chữ Run, code báo đỏ khắp nơi | Bạn đã mở sai thư mục. Hãy mở thư mục `hello-fx` (thư mục có file `build.gradle`), rồi đợi VS Code tải project xong. |
| Đã mở đúng thư mục mà vẫn báo đỏ | Nhấn `Ctrl+Shift+P`, chọn **Java: Clean Java Language Server Workspace**, rồi bấm **Restart**. |
| `git clone` báo `Repository not found` | Đường dẫn bị gõ sai. Hãy copy đúng lệnh ở mục 2. |
| `LoadException` khi chạy | Tên trong `main.fxml` không khớp với code Java (xem mục 4). |
