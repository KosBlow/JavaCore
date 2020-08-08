package core.tasks.level13.movieFactory;

 class MovieFactory {

    static Movie getMovie(String key) {
        Movie movie = null;

        //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
        if ("soapOpera".equals(key)) {
            movie = new SoapOpera();
        }
        else if("cartoon".equals(key)){
            movie = new Cartoon();
        }
        else if("thriller".equals(key)){
            movie = new Thriller();
        }

        //напишите тут ваш код, пункты 5,6

        return movie;
    }
}
