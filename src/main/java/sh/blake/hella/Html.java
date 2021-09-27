package sh.blake.hella;

import sh.blake.hella.node.AttributeNode;
import sh.blake.hella.node.HtmlNode;
import sh.blake.hella.node.Node;
import sh.blake.hella.node.TextNode;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * The interface Html.
 */
@SuppressWarnings("unused")
public interface Html {

    // Utilities

    /**
     * From file to text node.
     *
     * @param filePath the file path
     * @return the string
     */
    static TextNode fromFile(String filePath) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            return new TextNode(String.join("\n", lines));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * From resource to text node.
     *
     * @param resourcePath the resource path
     * @return the string
     */
    static TextNode fromResource(String resourcePath) {
        try {
            URL url = Objects.requireNonNull(Html.class.getClassLoader().getResource(resourcePath));
            List<String> lines = Files.readAllLines(Paths.get(url.toURI()));
            return new TextNode(String.join("\n", lines));
        } catch (IOException | URISyntaxException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Text node.
     *
     * @param text the text
     * @return the node
     */
    static Node text(String text) {
        return new TextNode(text);
    }

    // Attributes

    /**
     * Attr attribute node.
     *
     * @param key   the key
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode attr(String key, String value) {
        return new AttributeNode(key, value);
    }

    /**
     * Accept attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode accept(String value) {
        return attr("href", value);
    }

    /**
     * Accept charset attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode accept_charset(String value) {
        return attr("accept-charset", value);
    }

    /**
     * Accesskey attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode accesskey(String value) {
        return attr("accesskey", value);
    }

    /**
     * Action attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode action(String value) {
        return attr("action", value);
    }

    /**
     * Align attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode align(String value) {
        return attr("align", value);
    }

    /**
     * Allow attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode allow(String value) {
        return attr("allow", value);
    }

    /**
     * Alt attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode alt(String value) {
        return attr("alt", value);
    }

    /**
     * Async attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode async(String value) {
        return attr("async", value);
    }

    /**
     * Autocapitalize attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode autocapitalize(String value) {
        return attr("autocapitalize", value);
    }

    /**
     * Autocomplete attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode autocomplete(String value) {
        return attr("autocomplete", value);
    }

    /**
     * Autofocus attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode autofocus(String value) {
        return attr("autofocus", value);
    }

    /**
     * Autoplay attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode autoplay(String value) {
        return attr("autoplay", value);
    }

    /**
     * Background attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode background(String value) {
        return attr("background", value);
    }

    /**
     * Bgcolor attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode bgcolor(String value) {
        return attr("bgcolor", value);
    }

    /**
     * Border attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode border(String value) {
        return attr("border", value);
    }

    /**
     * Buffered attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode buffered(String value) {
        return attr("buffered", value);
    }

    /**
     * Capture attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode capture(String value) {
        return attr("capture", value);
    }

    /**
     * Challenge attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode challenge(String value) {
        return attr("challenge", value);
    }

    /**
     * Charset attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode charset(String value) {
        return attr("charset", value);
    }

    /**
     * Checked attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode checked(String value) {
        return attr("checked", value);
    }

    /**
     * Cite attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode cite(String value) {
        return attr("cite", value);
    }

    /**
     * Clazz attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode clazz(String value) {
        return attr("class", value);
    }

    /**
     * Classs attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode classs(String value) {
        return attr("class", value);
    }

    /**
     * Code attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode code(String value) {
        return attr("code", value);
    }

    /**
     * Codebase attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode codebase(String value) {
        return attr("codebase", value);
    }

    /**
     * Color attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode color(String value) {
        return attr("color", value);
    }

    /**
     * Cols attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode cols(String value) {
        return attr("cols", value);
    }

    /**
     * Colspan attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode colspan(String value) {
        return attr("colspan", value);
    }

    /**
     * Content attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode content(String value) {
        return attr("content", value);
    }

    /**
     * Contenteditable attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode contenteditable(String value) {
        return attr("contenteditable", value);
    }

    /**
     * Contextmenu attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode contextmenu(String value) {
        return attr("contextmenu", value);
    }

    /**
     * Controls attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode controls(String value) {
        return attr("controls", value);
    }

    /**
     * Coords attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode coords(String value) {
        return attr("coords", value);
    }

    /**
     * Crossorigin attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode crossorigin(String value) {
        return attr("crossorigin", value);
    }

    /**
     * Csp attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode csp(String value) {
        return attr("csp", value);
    }

    /**
     * Data attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode data(String value) {
        return attr("data", value);
    }

    /**
     * Data attribute node.
     *
     * @param key   the key
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode data_(String key, String value) {
        return attr("data-" + key, value);
    }

    /**
     * Datetime attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode datetime(String value) {
        return attr("datetime", value);
    }

    /**
     * Decoding attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode decoding(String value) {
        return attr("decoding", value);
    }

    /**
     * Dfault attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode dfault(String value) {
        return attr("default", value);
    }

    /**
     * Defaultt attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode defaultt(String value) {
        return attr("default", value);
    }

    /**
     * Defer attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode defer(String value) {
        return attr("defer", value);
    }

    /**
     * Dir attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode dir(String value) {
        return attr("dir", value);
    }

    /**
     * Dirname attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode dirname(String value) {
        return attr("dirname", value);
    }

    /**
     * Disabled attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode disabled(String value) {
        return attr("disabled", value);
    }

    /**
     * Download attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode download(String value) {
        return attr("download", value);
    }

    /**
     * Draggable attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode draggable(String value) {
        return attr("draggable", value);
    }

    /**
     * Enctype attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode enctype(String value) {
        return attr("enctype", value);
    }

    /**
     * Enterkeyhint attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode enterkeyhint(String value) {
        return attr("enterkeyhint", value);
    }

    /**
     * Forr attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode forr(String value) {
        return attr("for", value);
    }

    /**
     * Form attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode form(String value) {
        return attr("form", value);
    }

    /**
     * Formaction attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode formaction(String value) {
        return attr("formaction", value);
    }

    /**
     * Formenctype attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode formenctype(String value) {
        return attr("formenctype", value);
    }

    /**
     * Formmethod attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode formmethod(String value) {
        return attr("formmethod", value);
    }

    /**
     * Formnovalidate attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode formnovalidate(String value) {
        return attr("formnovalidate", value);
    }

    /**
     * Formtarget attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode formtarget(String value) {
        return attr("formtarget", value);
    }

    /**
     * Headers attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode headers(String value) {
        return attr("headers", value);
    }

    /**
     * Height attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode height(String value) {
        return attr("height", value);
    }

    /**
     * Hidden attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode hidden(String value) {
        return attr("hidden", value);
    }

    /**
     * High attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode high(String value) {
        return attr("high", value);
    }

    /**
     * Href attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode href(String value) {
        return attr("href", value);
    }

    /**
     * Hreflang attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode hreflang(String value) {
        return attr("hreflang", value);
    }

    /**
     * Http equiv attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode http_equiv(String value) {
        return attr("http-equiv", value);
    }

    /**
     * Icon attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode icon(String value) {
        return attr("icon", value);
    }

    /**
     * Id attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode id(String value) {
        return attr("id", value);
    }

    /**
     * Importance attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode importance(String value) {
        return attr("importance", value);
    }

    /**
     * Integrity attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode integrity(String value) {
        return attr("integrity", value);
    }

    /**
     * Intrinsicsize attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode intrinsicsize(String value) {
        return attr("intrinsicsize", value);
    }

    /**
     * Inputmode attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode inputmode(String value) {
        return attr("inputmode", value);
    }

    /**
     * Ismap attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode ismap(String value) {
        return attr("ismap", value);
    }

    /**
     * Itemprop attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode itemprop(String value) {
        return attr("itemprop", value);
    }

    /**
     * Keytype attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode keytype(String value) {
        return attr("keytype", value);
    }

    /**
     * Kind attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode kind(String value) {
        return attr("kind", value);
    }

    /**
     * Label attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode label(String value) {
        return attr("label", value);
    }

    /**
     * Lang attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode lang(String value) {
        return attr("lang", value);
    }

    /**
     * Language attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode language(String value) {
        return attr("language", value);
    }

    /**
     * Loading attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode loading(String value) {
        return attr("loading", value);
    }

    /**
     * List attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode list(String value) {
        return attr("list", value);
    }

    /**
     * Loop attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode loop(String value) {
        return attr("loop", value);
    }

    /**
     * Low attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode low(String value) {
        return attr("low", value);
    }

    /**
     * Manifest attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode manifest(String value) {
        return attr("manifest", value);
    }

    /**
     * Max attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode max(String value) {
        return attr("max", value);
    }

    /**
     * Maxlength attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode maxlength(String value) {
        return attr("maxlength", value);
    }

    /**
     * Minlength attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode minlength(String value) {
        return attr("minlength", value);
    }

    /**
     * Media attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode media(String value) {
        return attr("media", value);
    }

    /**
     * Method attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode method(String value) {
        return attr("method", value);
    }

    /**
     * Min attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode min(String value) {
        return attr("min", value);
    }

    /**
     * Multiple attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode multiple(String value) {
        return attr("multiple", value);
    }

    /**
     * Muted attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode muted(String value) {
        return attr("muted", value);
    }

    /**
     * Name attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode name(String value) {
        return attr("name", value);
    }

    /**
     * Novalidate attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode novalidate(String value) {
        return attr("novalidate", value);
    }

    /**
     * Open attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode open(String value) {
        return attr("open", value);
    }

    /**
     * Optimum attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode optimum(String value) {
        return attr("optimum", value);
    }

    /**
     * Pattern attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode pattern(String value) {
        return attr("pattern", value);
    }

    /**
     * Ping attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode ping(String value) {
        return attr("ping", value);
    }

    /**
     * Placeholder attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode placeholder(String value) {
        return attr("placeholder", value);
    }

    /**
     * Poster attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode poster(String value) {
        return attr("poster", value);
    }

    /**
     * Preload attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode preload(String value) {
        return attr("preload", value);
    }

    /**
     * Radiogroup attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode radiogroup(String value) {
        return attr("radiogroup", value);
    }

    /**
     * Readonly attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode readonly(String value) {
        return attr("readonly", value);
    }

    /**
     * Referrerpolicy attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode referrerpolicy(String value) {
        return attr("referrerpolicy", value);
    }

    /**
     * Rel attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode rel(String value) {
        return attr("rel", value);
    }

    /**
     * Required attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode required(String value) {
        return attr("required", value);
    }

    /**
     * Reversed attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode reversed(String value) {
        return attr("reversed", value);
    }

    /**
     * Rows attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode rows(String value) {
        return attr("rows", value);
    }

    /**
     * Rowspan attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode rowspan(String value) {
        return attr("rowspan", value);
    }

    /**
     * Sandbox attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode sandbox(String value) {
        return attr("sandbox", value);
    }

    /**
     * Scope attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode scope(String value) {
        return attr("scope", value);
    }

    /**
     * Scoped attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode scoped(String value) {
        return attr("scoped", value);
    }

    /**
     * Selected attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode selected(String value) {
        return attr("selected", value);
    }

    /**
     * Shape attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode shape(String value) {
        return attr("shape", value);
    }

    /**
     * Size attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode size(String value) {
        return attr("size", value);
    }

    /**
     * Sizes attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode sizes(String value) {
        return attr("sizes", value);
    }

    /**
     * Slot attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode slot(String value) {
        return attr("slot", value);
    }

    /**
     * Span attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode span(String value) {
        return attr("span", value);
    }

    /**
     * Spellcheck attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode spellcheck(String value) {
        return attr("spellcheck", value);
    }

    /**
     * Src attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode src(String value) {
        return attr("src", value);
    }

    /**
     * Srcdoc attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode srcdoc(String value) {
        return attr("srcdoc", value);
    }

    /**
     * Srclang attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode srclang(String value) {
        return attr("srclang", value);
    }

    /**
     * Srcset attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode srcset(String value) {
        return attr("srcset", value);
    }

    /**
     * Start attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode start(String value) {
        return attr("start", value);
    }

    /**
     * Step attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode step(String value) {
        return attr("step", value);
    }

    /**
     * Style attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode style(String value) {
        return attr("style", value);
    }

    /**
     * Summary attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode summary(String value) {
        return attr("summary", value);
    }

    /**
     * Tabindex attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode tabindex(String value) {
        return attr("tabindex", value);
    }

    /**
     * Target attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode target(String value) {
        return attr("target", value);
    }

    /**
     * Title attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode title(String value) {
        return attr("title", value);
    }

    /**
     * Translate attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode translate(String value) {
        return attr("translate", value);
    }

    /**
     * Type attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode type(String value) {
        return attr("type", value);
    }

    /**
     * Usemap attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode usemap(String value) {
        return attr("usemap", value);
    }

    /**
     * Value attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode value(String value) {
        return attr("value", value);
    }

    /**
     * Width attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode width(String value) {
        return attr("width", value);
    }

    /**
     * Wrap attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static AttributeNode wrap(String value) {
        return attr("wrap", value);
    }

    // Tags

    /**
     * Tag node.
     *
     * @param name     the name
     * @param children the children
     * @return the node
     */
    static Node tag(String name, Node... children) {
        return new Node(name, children);
    }

    // Main root

    /**
     * Html node.
     *
     * @param children the children
     * @return the node
     */
    static Node html(Node... children) {
        return new HtmlNode(children);
    }

    // Document metadata

    /**
     * Base node.
     *
     * @param children the children
     * @return the node
     */
    static Node base(Node... children) {
        return tag("base", children);
    }

    /**
     * Head node.
     *
     * @param children the children
     * @return the node
     */
    static Node head(Node... children) {
        return tag("head", children);
    }

    /**
     * Link node.
     *
     * @param children the children
     * @return the node
     */
    static Node link(Node... children) {
        return tag("link", children);
    }

    /**
     * Meta node.
     *
     * @param children the children
     * @return the node
     */
    static Node meta(Node... children) {
        return tag("meta", children);
    }

    /**
     * Style node.
     *
     * @param children the children
     * @return the node
     */
    static Node style(Node... children) {
        return tag("style", children);
    }

    /**
     * Title node.
     *
     * @param children the children
     * @return the node
     */
    static Node title(Node... children) {
        return tag("title", children);
    }

    // Sectioning root

    /**
     * Body node.
     *
     * @param children the children
     * @return the node
     */
    static Node body(Node... children) {
        return tag("body", children);
    }

    // Content sectioning


    /**
     * Address node.
     *
     * @param children the children
     * @return the node
     */
    static Node address(Node... children) {
        return tag("address", children);
    }

    /**
     * Article node.
     *
     * @param children the children
     * @return the node
     */
    static Node article(Node... children) {
        return tag("article", children);
    }

    /**
     * Aside node.
     *
     * @param children the children
     * @return the node
     */
    static Node aside(Node... children) {
        return tag("aside", children);
    }

    /**
     * Footer node.
     *
     * @param children the children
     * @return the node
     */
    static Node footer(Node... children) {
        return tag("footer", children);
    }

    /**
     * Header node.
     *
     * @param children the children
     * @return the node
     */
    static Node header(Node... children) {
        return tag("header", children);
    }

    /**
     * H 1 node.
     *
     * @param children the children
     * @return the node
     */
    static Node h1(Node... children) {
        return tag("h1", children);
    }
    /**
     * H 2 node.
     *
     * @param children the children
     * @return the node
     */
    static Node h2(Node... children) {
        return tag("h2", children);
    }

    /**
     * H 3 node.
     *
     * @param children the children
     * @return the node
     */
    static Node h3(Node... children) {
        return tag("h3", children);
    }

    /**
     * H 4 node.
     *
     * @param children the children
     * @return the node
     */
    static Node h4(Node... children) {
        return tag("h4", children);
    }

    /**
     * H 5 node.
     *
     * @param children the children
     * @return the node
     */
    static Node h5(Node... children) {
        return tag("h5", children);
    }

    /**
     * H 6 node.
     *
     * @param children the children
     * @return the node
     */
    static Node h6(Node... children) {
        return tag("h6", children);
    }

    /**
     * Main node.
     *
     * @param children the children
     * @return the node
     */
    static Node main(Node... children) {
        return tag("main", children);
    }

    /**
     * Nav node.
     *
     * @param children the children
     * @return the node
     */
    static Node nav(Node... children) {
        return tag("nav", children);
    }

    /**
     * Section node.
     *
     * @param children the children
     * @return the node
     */
    static Node section(Node... children) {
        return tag("section", children);
    }

    // Text content

    /**
     * Blockquote node.
     *
     * @param children the children
     * @return the node
     */
    static Node blockquote(Node... children) {
        return tag("blockquote", children);
    }

    /**
     * Dd node.
     *
     * @param children the children
     * @return the node
     */
    static Node dd(Node... children) {
        return tag("dd", children);
    }

    /**
     * Div node.
     *
     * @param children the children
     * @return the node
     */
    static Node div(Node... children) {
        return tag("div", children);
    }

    /**
     * Dl node.
     *
     * @param children the children
     * @return the node
     */
    static Node dl(Node... children) {
        return tag("dl", children);
    }

    /**
     * Dt node.
     *
     * @param children the children
     * @return the node
     */
    static Node dt(Node... children) {
        return tag("dt", children);
    }

    /**
     * Figcaption node.
     *
     * @param children the children
     * @return the node
     */
    static Node figcaption(Node... children) {
        return tag("figcaption", children);
    }

    /**
     * Figure node.
     *
     * @param children the children
     * @return the node
     */
    static Node figure(Node... children) {
        return tag("figure", children);
    }

    /**
     * Hr node.
     *
     * @param children the children
     * @return the node
     */
    static Node hr(Node... children) {
        return tag("hr", children);
    }

    /**
     * Li node.
     *
     * @param children the children
     * @return the node
     */
    static Node li(Node... children) {
        return tag("li", children);
    }

    /**
     * Ol node.
     *
     * @param children the children
     * @return the node
     */
    static Node ol(Node... children) {
        return tag("ol", children);
    }

    /**
     * P node.
     *
     * @param children the children
     * @return the node
     */
    static Node p(Node... children) {
        return tag("p", children);
    }

    /**
     * Pre node.
     *
     * @param children the children
     * @return the node
     */
    static Node pre(Node... children) {
        return tag("pre", children);
    }

    /**
     * Ul node.
     *
     * @param children the children
     * @return the node
     */
    static Node ul(Node... children) {
        return tag("ul", children);
    }

    // Inline text semantics

    /**
     * A node.
     *
     * @param children the children
     * @return the node
     */
    static Node a(Node... children) {
        return tag("a", children);
    }

    /**
     * Abbr node.
     *
     * @param children the children
     * @return the node
     */
    static Node abbr(Node... children) {
        return tag("abbr", children);
    }

    /**
     * B node.
     *
     * @param children the children
     * @return the node
     */
    static Node b(Node... children) {
        return tag("b", children);
    }

    /**
     * Bdi node.
     *
     * @param children the children
     * @return the node
     */
    static Node bdi(Node... children) {
        return tag("bdi", children);
    }

    /**
     * Bdo node.
     *
     * @param children the children
     * @return the node
     */
    static Node bdo(Node... children) {
        return tag("bdo", children);
    }

    /**
     * Br node.
     *
     * @param children the children
     * @return the node
     */
    static Node br(Node... children) {
        return tag("br", children);
    }

    /**
     * Cite node.
     *
     * @param children the children
     * @return the node
     */
    static Node cite(Node... children) {
        return tag("cite", children);
    }

    /**
     * Code node.
     *
     * @param children the children
     * @return the node
     */
    static Node code(Node... children) {
        return tag("code", children);
    }

    /**
     * Data node.
     *
     * @param children the children
     * @return the node
     */
    static Node data(Node... children) {
        return tag("data", children);
    }

    /**
     * Dfn node.
     *
     * @param children the children
     * @return the node
     */
    static Node dfn(Node... children) {
        return tag("dfn", children);
    }

    /**
     * Em node.
     *
     * @param children the children
     * @return the node
     */
    static Node em(Node... children) {
        return tag("em", children);
    }

    /**
     * node.
     *
     * @param children the children
     * @return the node
     */
    static Node i(Node... children) {
        return tag("i", children);
    }

    /**
     * Kbd node.
     *
     * @param children the children
     * @return the node
     */
    static Node kbd(Node... children) {
        return tag("kbd", children);
    }

    /**
     * Mark node.
     *
     * @param children the children
     * @return the node
     */
    static Node mark(Node... children) {
        return tag("mark", children);
    }

    /**
     * Q node.
     *
     * @param children the children
     * @return the node
     */
    static Node q(Node... children) {
        return tag("q", children);
    }

    /**
     * Rp node.
     *
     * @param children the children
     * @return the node
     */
    static Node rp(Node... children) {
        return tag("rp", children);
    }

    /**
     * Rt node.
     *
     * @param children the children
     * @return the node
     */
    static Node rt(Node... children) {
        return tag("rt", children);
    }

    /**
     * Ruby node.
     *
     * @param children the children
     * @return the node
     */
    static Node ruby(Node... children) {
        return tag("ruby", children);
    }

    /**
     * S node.
     *
     * @param children the children
     * @return the node
     */
    static Node s(Node... children) {
        return tag("s", children);
    }

    /**
     * Samp node.
     *
     * @param children the children
     * @return the node
     */
    static Node samp(Node... children) {
        return tag("samp", children);
    }

    /**
     * Small node.
     *
     * @param children the children
     * @return the node
     */
    static Node small(Node... children) {
        return tag("small", children);
    }

    /**
     * Span node.
     *
     * @param children the children
     * @return the node
     */
    static Node span(Node... children) {
        return tag("span", children);
    }

    /**
     * Strong node.
     *
     * @param children the children
     * @return the node
     */
    static Node strong(Node... children) {
        return tag("strong", children);
    }

    /**
     * Sub node.
     *
     * @param children the children
     * @return the node
     */
    static Node sub(Node... children) {
        return tag("sub", children);
    }

    /**
     * Sup node.
     *
     * @param children the children
     * @return the node
     */
    static Node sup(Node... children) {
        return tag("sup", children);
    }

    /**
     * Time node.
     *
     * @param children the children
     * @return the node
     */
    static Node time(Node... children) {
        return tag("time", children);
    }

    /**
     * U node.
     *
     * @param children the children
     * @return the node
     */
    static Node u(Node... children) {
        return tag("u", children);
    }

    /**
     * Var node.
     *
     * @param children the children
     * @return the node
     */
    static Node var(Node... children) {
        return tag("var", children);
    }

    /**
     * Wbr node.
     *
     * @param children the children
     * @return the node
     */
    static Node wbr(Node... children) {
        return tag("wbr", children);
    }

    // Image and multimedia

    /**
     * Area node.
     *
     * @param children the children
     * @return the node
     */
    static Node area(Node... children) {
        return tag("area", children);
    }

    /**
     * Audio node.
     *
     * @param children the children
     * @return the node
     */
    static Node audio(Node... children) {
        return tag("audio", children);
    }

    /**
     * Img node.
     *
     * @param children the children
     * @return the node
     */
    static Node img(Node... children) {
        return tag("img", children);
    }

    /**
     * Map node.
     *
     * @param children the children
     * @return the node
     */
    static Node map(Node... children) {
        return tag("map", children);
    }

    /**
     * Track node.
     *
     * @param children the children
     * @return the node
     */
    static Node track(Node... children) {
        return tag("track", children);
    }

    /**
     * Video node.
     *
     * @param children the children
     * @return the node
     */
    static Node video(Node... children) {
        return tag("video", children);
    }

    // Embedded content

    /**
     * Embed node.
     *
     * @param children the children
     * @return the node
     */
    static Node embed(Node... children) {
        return tag("embed", children);
    }

    /**
     * Iframe node.
     *
     * @param children the children
     * @return the node
     */
    static Node iframe(Node... children) {
        return tag("iframe", children);
    }

    /**
     * Object node.
     *
     * @param children the children
     * @return the node
     */
    static Node object(Node... children) {
        return tag("objcet", children);
    }

    /**
     * Param node.
     *
     * @param children the children
     * @return the node
     */
    static Node param(Node... children) {
        return tag("param", children);
    }

    /**
     * Picture node.
     *
     * @param children the children
     * @return the node
     */
    static Node picture(Node... children) {
        return tag("picture", children);
    }

    /**
     * Portal node.
     *
     * @param children the children
     * @return the node
     */
    static Node portal(Node... children) {
        return tag("portal", children);
    }

    /**
     * Source node.
     *
     * @param children the children
     * @return the node
     */
    static Node source(Node... children) {
        return tag("source", children);
    }

    // SVG and MathML

    /**
     * Svg node.
     *
     * @param children the children
     * @return the node
     */
    static Node svg(Node... children) {
        return tag("svg", children);
    }

    /**
     * Math node.
     *
     * @param children the children
     * @return the node
     */
    static Node math(Node... children) {
        return tag("math", children);
    }

    // Scripting

    /**
     * Canvas node.
     *
     * @param children the children
     * @return the node
     */
    static Node canvas(Node... children) {
        return tag("canvas", children);
    }

    /**
     * Noscript node.
     *
     * @param children the children
     * @return the node
     */
    static Node noscript(Node... children) {
        return tag("noscript", children);
    }

    /**
     * Script node.
     *
     * @param children the children
     * @return the node
     */
    static Node script(Node... children) {
        return tag("script", children);
    }

    // Demarcating edits

    /**
     * Del node.
     *
     * @param children the children
     * @return the node
     */
    static Node del(Node... children) {
        return tag("del", children);
    }

    /**
     * Ins node.
     *
     * @param children the children
     * @return the node
     */
    static Node ins(Node... children) {
        return tag("ins", children);
    }

    // Table content

    /**
     * Caption node.
     *
     * @param children the children
     * @return the node
     */
    static Node caption(Node... children) {
        return tag("caption", children);
    }

    /**
     * Col node.
     *
     * @param children the children
     * @return the node
     */
    static Node col(Node... children) {
        return tag("col", children);
    }

    /**
     * Colgroup node.
     *
     * @param children the children
     * @return the node
     */
    static Node colgroup(Node... children) {
        return tag("colgroup", children);
    }

    /**
     * Table node.
     *
     * @param children the children
     * @return the node
     */
    static Node table(Node... children) {
        return tag("table", children);
    }

    /**
     * Tbody node.
     *
     * @param children the children
     * @return the node
     */
    static Node tbody(Node... children) {
        return tag("tbody", children);
    }

    /**
     * Td node.
     *
     * @param children the children
     * @return the node
     */
    static Node td(Node... children) {
        return tag("td", children);
    }

    /**
     * Tfoot node.
     *
     * @param children the children
     * @return the node
     */
    static Node tfoot(Node... children) {
        return tag("tfoot", children);
    }

    /**
     * Th node.
     *
     * @param children the children
     * @return the node
     */
    static Node th(Node... children) {
        return tag("th", children);
    }

    /**
     * Thead node.
     *
     * @param children the children
     * @return the node
     */
    static Node thead(Node... children) {
        return tag("thead", children);
    }

    /**
     * Tr node.
     *
     * @param children the children
     * @return the node
     */
    static Node tr(Node... children) {
        return tag("tr", children);
    }

    // Forms

    /**
     * Button node.
     *
     * @param children the children
     * @return the node
     */
    static Node button(Node... children) {
        return tag("button", children);
    }

    /**
     * Datalist node.
     *
     * @param children the children
     * @return the node
     */
    static Node datalist(Node... children) {
        return tag("datalist", children);
    }

    /**
     * Fieldset node.
     *
     * @param children the children
     * @return the node
     */
    static Node fieldset(Node... children) {
        return tag("fieldset", children);
    }

    /**
     * Form node.
     *
     * @param children the children
     * @return the node
     */
    static Node form(Node... children) {
        return tag("form", children);
    }

    /**
     * Input node.
     *
     * @param children the children
     * @return the node
     */
    static Node input(Node... children) {
        return tag("input", children);
    }

    /**
     * Label node.
     *
     * @param children the children
     * @return the node
     */
    static Node label(Node... children) {
        return tag("label", children);
    }

    /**
     * Legend node.
     *
     * @param children the children
     * @return the node
     */
    static Node legend(Node... children) {
        return tag("legend", children);
    }

    /**
     * Meter node.
     *
     * @param children the children
     * @return the node
     */
    static Node meter(Node... children) {
        return tag("meter", children);
    }

    /**
     * Optgroup node.
     *
     * @param children the children
     * @return the node
     */
    static Node optgroup(Node... children) {
        return tag("optgroup", children);
    }

    /**
     * Option node.
     *
     * @param children the children
     * @return the node
     */
    static Node option(Node... children) {
        return tag("option", children);
    }

    /**
     * Output node.
     *
     * @param children the children
     * @return the node
     */
    static Node output(Node... children) {
        return tag("output", children);
    }

    /**
     * Progress node.
     *
     * @param children the children
     * @return the node
     */
    static Node progress(Node... children) {
        return tag("progress", children);
    }

    /**
     * Select node.
     *
     * @param children the children
     * @return the node
     */
    static Node select(Node... children) {
        return tag("select", children);
    }

    /**
     * Textarea node.
     *
     * @param children the children
     * @return the node
     */
    static Node textarea(Node... children) {
        return tag("textarea", children);
    }

    // Interactive elements

    /**
     * Details node.
     *
     * @param children the children
     * @return the node
     */
    static Node details(Node... children) {
        return tag("details", children);
    }

    /**
     * Dialog node.
     *
     * @param children the children
     * @return the node
     */
    static Node dialog(Node... children) {
        return tag("dialog", children);
    }

    /**
     * Menu node.
     *
     * @param children the children
     * @return the node
     */
    static Node menu(Node... children) {
        return tag("menu", children);
    }

    /**
     * Summary node.
     *
     * @param children the children
     * @return the node
     */
    static Node summary(Node... children) {
        return tag("summary", children);
    }

    /**
     * Slot node.
     *
     * @param children the children
     * @return the node
     */
    static Node slot(Node... children) {
        return tag("slot", children);
    }

    /**
     * Template node.
     *
     * @param children the children
     * @return the node
     */
    static Node template(Node... children) {
        return tag("template", children);
    }
}
