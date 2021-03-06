# Download the Ruby helper library from twilio.com/docs/libraries/ruby
require 'twilio-ruby'

# Get your Account Sid and Auth Token from https://www.twilio.com/console
account_sid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX'
auth_token = 'your_auth_token'

client = Twilio::REST::Client.new(account_sid, auth_token)

segments = client.notify.v1
                 .services('ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX')
                 .segments.list

segments.each do |segment|
  puts segment.sid
end
