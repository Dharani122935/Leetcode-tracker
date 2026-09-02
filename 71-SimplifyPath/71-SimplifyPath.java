// Last updated: 02/09/2026, 09:58:41
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>(); 
        String[] directories = path.split("/"); 
        for (String dir : directories) { 
            if (dir.equals(".") || dir.isEmpty()) { 
                continue;
            } else if (dir.equals("..")) { 
                if (!stack.isEmpty()) { 
                    stack.pop();
                }
            } else { 
                stack.push(dir);
            }
        }
        return "/" + String.join("/", stack); 
    }
}